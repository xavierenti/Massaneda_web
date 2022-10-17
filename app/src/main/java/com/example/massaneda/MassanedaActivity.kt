package com.example.massaneda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.massaneda.databinding.ActivityLoguinBinding
import com.example.massaneda.databinding.ActivityMassanedaBinding

class MassanedaActivity : AppCompatActivity() {

    lateinit var binding: ActivityMassanedaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMassanedaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}