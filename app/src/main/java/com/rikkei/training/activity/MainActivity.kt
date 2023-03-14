package com.rikkei.training.activity

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import com.rikkei.training.activity.databinding.ActivityMainBinding
import com.rikkei.training.activity.fragments.Fragment1
import com.rikkei.training.activity.fragments.Fragment2

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreateA: ")
        binding.btnA.setOnClickListener{
            fragment1Change()
        }
        binding.btnB.setOnClickListener{
            fragment2Change()
        }
        binding.btnBack.setOnClickListener{
            fragmentBack()
        }
    }

    private fun fragmentBack() {
        supportFragmentManager.popBackStack()
    }

    private fun fragment1Change() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fm_content, Fragment1())
            .addToBackStack("1")
            .commit()
    }

    private fun fragment2Change() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fm_content, Fragment2())
            .addToBackStack("2")
            .commit()
    }


}

