package com.rikkei.training.activity.fragments

import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rikkei.training.activity.R
import com.rikkei.training.activity.databinding.Fragment1Binding
import com.rikkei.training.activity.databinding.Fragment2Binding
import kotlin.math.log

class Fragment1: Fragment() {

    companion object{
        private const val TAG = "Fragment1"
    }

    private var currentPosition: Int = 0

    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var binding: Fragment1Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment1Binding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        mediaPlayer = MediaPlayer.create(activity, R.raw.loveme)
        Log.d(TAG, "onAttach1: ")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate1: ")
    }

    override fun onStart() {
        super.onStart()
        mediaPlayer.seekTo(currentPosition)
        mediaPlayer.start()
        Log.d(TAG, "onStart1: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume1: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause1: ")
    }

    override fun onStop() {
        super.onStop()
        mediaPlayer.pause()
        currentPosition = mediaPlayer.currentPosition
        Log.d(TAG, "onStop1: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy1: ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach1: ")
    }
}
