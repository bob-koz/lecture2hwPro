package com.example.lesson2pro_1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.RadioButton
import android.widget.TextView
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val btnSubmit = findViewById(R.id.buttonSubmit)
        val buttonSubmit: Button = findViewById(R.id.buttonSubmit)
        val btnJava:RadioButton = findViewById(R.id.Java)
        val btnKotlin:RadioButton = findViewById(R.id.Kotlin)
        val btnPython:RadioButton = findViewById(R.id.Python)
        val btnFortran:RadioButton = findViewById(R.id.Fortran)
        val curText: TextView = findViewById(R.id.textViewSelected)

        buttonSubmit.setOnClickListener {

            val GButtons: RadioGroup = findViewById(R.id.GroupButtons)

                val Selection = when (GButtons.checkedRadioButtonId) {
                    btnPython.id -> "Python"
                    btnJava.id -> "Java"
                    btnKotlin.id -> "Kotlin"
                    btnFortran.id -> "Fortran"

                    else -> ""

                }
            curText.text = "Выбран $Selection"

        }

    }



}