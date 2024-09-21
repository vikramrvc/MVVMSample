package com.rvc.learnmvvm.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.rvc.learnmvvm.R
import com.rvc.learnmvvm.databinding.ActivityMainBinding
import com.rvc.learnmvvm.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var calculatorViewModel: CalculatorViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calculatorViewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)

        binding.calculateBtn.setOnClickListener{

            binding.displayResult.text = calculatorViewModel.calculateSum(binding.num1.text.toString().toIntOrNull()?:0,
                binding.num2.text.toString().toIntOrNull()?:0).ans.toString()
        }
    }
}