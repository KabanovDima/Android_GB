package com.example.android.lec_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.android.lec_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var counter: Int = 0
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.textViewLec1.text = getText(R.string.testText)
//        binding.textViewLec1.text = binding.textViewLec1.context.getText(R.string.testText)
//        binding.textViewLec1.isAllCaps = false

        binding.textViewLec1.text=counter.toString()

        binding.button.setOnClickListener {
            binding.buttonPlus.isEnabled = false
//            binding.textViewLec1.text = "Button is clicked!"
        }


        binding.buttonPlus.setOnClickListener {

            if(counter==5){
                counter=0
                binding.button.visibility = View.VISIBLE
            } else{
                counter++
            }
            binding.textViewLec1.text = counter.toString()
        }

//        binding.textViewLec1.text = "Hello, GB!"
//        binding.anotherTextView.text = "I'm setted too!!"

//        val textView: TextView = findViewById(R.id.textView_Lec_1)
//        textView.text = "Hi, my"
    }
}