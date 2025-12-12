package com.example.students_dynamic_list

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.students_dynamic_list.databinding.ActivityStudentRecycleViewBinding
import com.example.students_dynamic_list.model.Model

class StudentRecycleViewActivity : AppCompatActivity() {

    var binding: ActivityStudentRecycleViewBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityStudentRecycleViewBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val layout = LinearLayoutManager(this)
        binding?.studentsRecyclerView?.layoutManager = layout
        binding?.studentsRecyclerView?.setHasFixedSize(true)

        val adapter = StudentAdapter(Model.shared.students)
        binding?.studentsRecyclerView?.adapter = adapter

    }
}