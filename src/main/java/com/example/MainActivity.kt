package com.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    //Since Kotlin Synthetics is deprecated, used JetPack Binding
    private lateinit var binding: ActivityMainBinding // late initialization
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // Jetpack binding
        val view = binding.root//Jetpack binding
        setContentView(view)
    }

    fun go(v: View) {
        if (::binding.isInitialized)
            binding.text.setText("Hello Kotlin!" + "\n" + Date())
    }
}
