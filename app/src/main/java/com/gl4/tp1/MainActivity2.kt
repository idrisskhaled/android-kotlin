package com.gl4.tp1


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.graphics.BitmapFactory


import androidx.activity.result.ActivityResult


import androidx.activity.result.contract.ActivityResultContracts


import java.io.FileNotFoundException
import java.io.InputStream
import java.util.*


class MainActivity2 : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var button: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        imageView = findViewById(R.id.imageView4)
        button = findViewById(R.id.buttonLoadPicture)
        button.setOnClickListener {
            val photoPickerIntent = Intent(Intent.ACTION_PICK)
            photoPickerIntent.type = "image/*"
            someActivityResultLauncher.launch(photoPickerIntent)
        }
    }
    private var someActivityResultLauncher = registerForActivityResult<Intent, ActivityResult>(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult ->
        if (result.resultCode == RESULT_OK) {
            // There are no request codes
            // doSomeOperations();
            val data = result.data
            val selectedImage: Uri? = Objects.requireNonNull(data)?.data
            var imageStream: InputStream? = null
            try {
                imageStream = selectedImage?.let { contentResolver.openInputStream(it) }
            } catch (e: FileNotFoundException) {
                e.printStackTrace()
            }
            BitmapFactory.decodeStream(imageStream)
            imageView.setImageURI(selectedImage) // To display selected image in image view
        }
    }

}
