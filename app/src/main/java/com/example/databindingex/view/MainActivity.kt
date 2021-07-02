package com.example.databindingex.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingex.R
import com.example.databindingex.databinding.ActivityMainBinding
import com.example.databindingex.model.User

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myUser = User("Xavier", "nara",26,false)

        //variable that was created in the xml using databinding
        binding.user = myUser

    }
}