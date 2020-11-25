package com.example.navegacionbasicapractica

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MainActivity::class.simpleName, "onCreate")

        et1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                s?.let {
                    var auxcadena=s
                    var num=s.split(" ").count()
                    if (num>4) {
                        b1.visibility=View.VISIBLE
                    } else {
                        b1.visibility = View.INVISIBLE
                    }

                }

            }
        })


    b1.setOnClickListener{
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)


    }
    }


}