package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

private const val IS_DIGITAL = "digitalOK"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentClock.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentClock : Fragment() {
    // TODO: Rename and change types of parameters
    private var digitalClock = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            digitalClock = it.getBoolean(IS_DIGITAL)
        }

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return if (!digitalClock)
            inflater.inflate(R.layout.frag_numeric, container, false)
        else
            inflater.inflate(R.layout.frag_digital, container, false)
    }
}