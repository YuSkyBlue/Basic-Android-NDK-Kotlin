package com.example.androidndk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val exampleJNI = ExampleJNI()
        val value = exampleJNI.addNumbers(1,1)
        Toast.makeText(this, value.toString(), Toast.LENGTH_SHORT).show()
    }
}