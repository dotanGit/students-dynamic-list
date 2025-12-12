package com.example.students_dynamic_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.students_dynamic_list.model.Student

class StudentAdapter (private val students: List<Student>) : RecyclerView.Adapter<StudentRowViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StudentRowViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.student_row_layout, parent, false)

        // Create and return a new ViewHolder instance
        return StudentRowViewHolder(itemView)
    }

    override fun onBindViewHolder(
        holder: StudentRowViewHolder,
        position: Int
    ) {
        holder.bind(students[position],position)
    }

    override fun getItemCount(): Int {
        return students.size

    }

}