package com.example.mycalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mycalculatorapp.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAc.setOnClickListener {
            binding.inputtext.text = ""
            binding.outputtext.text = ""
        }
        binding.btn0.setOnClickListener {
            binding.inputtext.append("0")

        }
        binding.btn1.setOnClickListener {
            binding.inputtext.append("1")
        }
        binding.btn2.setOnClickListener {
            binding.inputtext.append("2")
        }
        binding.btn3.setOnClickListener {
            binding.inputtext.append("3")
        }
        binding.btn4.setOnClickListener {
            binding.inputtext.append("4")
        }
        binding.btn5.setOnClickListener {
            binding.inputtext.append("5")
        }
        binding.btn6.setOnClickListener {
            binding.inputtext.append("6")
        }
        binding.btn7.setOnClickListener {
            binding.inputtext.append("7")
        }
        binding.btn8.setOnClickListener {
            binding.inputtext.append("8")
        }
        binding.btn9.setOnClickListener {
            binding.inputtext.append("9")
        }
        binding.btnPlus.setOnClickListener {
            binding.inputtext.append(" + ")
        }
        binding.btnMinus.setOnClickListener {
            binding.inputtext.append(" - ")
        }
        binding.btnDivide.setOnClickListener {
            binding.inputtext.append(" / ")

        }
        binding.btnMultiplaction.setOnClickListener {
            binding.inputtext.append(" * ")
        }
        binding.btnDot.setOnClickListener {
            binding.inputtext.append(".")
        }
        binding.btnStartBracket.setOnClickListener {
            binding.inputtext.append(" ( ")
        }
        binding.btnEndBracket.setOnClickListener {
            binding.inputtext.append(" ) ")
        }
        binding.btnEqual.setOnClickListener {
            val expression = ExpressionBuilder(binding.inputtext.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()
            if (result == longresult.toDouble()) {
                binding.outputtext.text = longresult.toString()
            } else {
                binding.outputtext.text = result.toString()
            }
        }

    }
}