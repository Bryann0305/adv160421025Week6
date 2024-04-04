package com.ubaya.adv160421025week6.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ubaya.adv160421025week6.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}