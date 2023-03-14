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
import com.rikkei.training.activity.databinding.Fragment2Binding

class Fragment2: Fragment() {

    companion object{
        private const val TAG = "Fragment2"
    }

    private lateinit var mediaPlayer: MediaPlayer

    private lateinit var binding: Fragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment2Binding.inflate(inflater, container, false)
        return binding.root
        Log.d(TAG, "onCreateView2: ")


    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach2: ")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate2: ")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "onActivityCreated2: ")
    }

    override fun onStart() {
        super.onStart()
        mediaPlayer = MediaPlayer.create(activity, R.raw.loco)
        mediaPlayer.isLooping = true
        mediaPlayer.start()
        Log.d(TAG, "onStart2: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume2: ")
    }

    override fun onPause() {
        super.onPause()
        mediaPlayer.pause()
        Log.d(TAG, "onPause2: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop2: ")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView2: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy2: ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach2: ")
    }
}
