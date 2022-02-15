package com.example.practical_21

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDone :Button = findViewById(R.id.btnDone)
        val nickNameText :TextView = findViewById(R.id.nickNameText)
        val textFieldName :TextView = findViewById(R.id.textFieldName)

        btnDone.setOnClickListener() {
            nickNameText.text = textFieldName.text

            btnDone.visibility = View.GONE
            textFieldName.visibility = View.GONE
            nickNameText.visibility = View.VISIBLE

            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(it.windowToken,0)
        }
        nickNameText.setOnClickListener(){
            btnDone.visibility = View.VISIBLE
            textFieldName.visibility = View.VISIBLE
            nickNameText.visibility = View.GONE

            nickNameText.requestFocus()
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.showSoftInput(textFieldName,0)
        }
    }
}