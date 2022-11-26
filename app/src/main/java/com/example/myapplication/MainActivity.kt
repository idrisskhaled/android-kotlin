package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ActionMode.Callback{
    private lateinit var binding : ActivityMainBinding
    private  lateinit var actionMode: ActionMode

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment,FragmentClock(),null)
            .addToBackStack(null)
            .commit()
        binding.button.setOnLongClickListener{
            actionMode = this@MainActivity.startActionMode(this@MainActivity)!!
            return@setOnLongClickListener true
        }
    }

    fun setTime(view: View?)
    {

        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val fragmentClock = FragmentClock()
        val bundle = Bundle()
        bundle.putBoolean("digitalOK", binding.switch1.isChecked)
        fragmentClock.arguments = bundle
        transaction.replace(R.id.fragment,fragmentClock)
        transaction.commit()


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.action_switch)
        {
            binding.switch1.isChecked = !binding.switch1.isChecked
            setTime(null)
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateActionMode(actionMode: ActionMode, menu: Menu?): Boolean {
        val inflater: MenuInflater = actionMode.menuInflater
        inflater.inflate(R.menu.context_mode_menu, menu)
        return true
    }

    override fun onPrepareActionMode(p0: ActionMode?, p1: Menu?): Boolean {
        return true
    }

    override fun onActionItemClicked(actionMode: ActionMode?, menuItem: MenuItem?): Boolean {
        return when (menuItem?.itemId) {
            R.id.action_color -> {
                binding.button.setBackgroundColor(
                    resources.getColor(
                        R.color.teal_200
                    )
                )
                actionMode?.finish()
                true
            }
            else -> false
        }
    }

    override fun onDestroyActionMode(p0: ActionMode?) {
    }
}