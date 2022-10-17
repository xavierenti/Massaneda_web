package com.example.massaneda

import androidx.appcompat.app.AppCompatActivity
import com.example.massaneda.databinding.ActivityLoguinBinding


class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}

