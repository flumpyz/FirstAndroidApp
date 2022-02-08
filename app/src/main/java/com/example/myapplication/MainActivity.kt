package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<TextView>(R.id.textView)
        view.text = "Как жаль, что в ТБВ всего 12 сезонов"
        val student = Student(name = "Petya", course = 3)
        print(student.name)
        student.toString()
    }
}

data class Student(
    val name: String,
    val course: Int
) {
    override fun toString(): String {
        return "$name, $course"
    }
}