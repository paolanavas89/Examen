package com.example.navegacionbasicapractica

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activitydos.*

class Activity2 : AppCompatActivity() {

    companion object {
        const val CLAVE = "clave"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitydos)
        Log.d(Activity2::class.simpleName, "onCreate")

        intent.getIntExtra(CLAVE,0)



    }
}