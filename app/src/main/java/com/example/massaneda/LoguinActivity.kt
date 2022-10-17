package com.example.massaneda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.massaneda.databinding.ActivityLoguinBinding

class LoguinActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoguinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoguinBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}