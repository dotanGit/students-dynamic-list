package com.example.students_dynamic_list

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.students_dynamic_list.databinding.ActivityStudentDetailBinding

class StudentDetailActivity : AppCompatActivity() {
    var binding: ActivityStudentDetailBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityStudentDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        // 1. Get the data from the Intent extras sent by StudentRowViewHolder
        val name = intent.getStringExtra("STUDENT_NAME")
        val id = intent.getStringExtra("STUDENT_ID")
        val phone = intent.getStringExtra("STUDENT_PHONE")
        val address = intent.getStringExtra("STUDENT_ADDRESS")
        val isChecked = intent.getBooleanExtra("STUDENT_IS_CHECKED", false)

        // 2. Use ViewBinding to set the text of each view in your layout
        binding?.activityStudentDetailsName?.text = name
        binding?.activityStudentDetailsId?.text = id
        binding?.activityStudentDetailsPhone?.text = phone
        binding?.activityStudentDetailsAddress?.text = address
        binding?.activityAddNewStudentIsCheckedBox?.isChecked = isChecked


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}