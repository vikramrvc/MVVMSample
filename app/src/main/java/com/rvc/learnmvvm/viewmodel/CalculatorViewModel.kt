package com.rvc.learnmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.rvc.learnmvvm.model.CalculatorData

class CalculatorViewModel : ViewModel() {

    fun calculateSum(num1:Int,num2:Int) : CalculatorData{

        return CalculatorData(num1, num2 , (num1+num2).toLong())
    }
}