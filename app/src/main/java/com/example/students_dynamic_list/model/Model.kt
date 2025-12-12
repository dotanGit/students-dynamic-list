package com.example.students_dynamic_list.model

class Model private constructor() {

    val students = mutableListOf<Student>()

    init {
        students.add(Student("Alice Smith", "S1001", "555-0101", "456 Oak Ave"));
        students.add(Student("Bob Johnson", "S1002", "555-0102", "789 Pine Ln"));
        students.add(Student("Charlie Brown", "S1003", "555-0103", "101 Elm Blvd"));
        students.add(Student("Diana Prince", "S1004", "555-0104", "202 Maple Dr"));
        students.add(Student("Ethan Hunt", "S1005", "555-0105", "303 Birch Ct"));
        students.add(Student("Fiona Glenn", "S1006", "555-0106", "404 Cedar Rd"));
        students.add(Student("George Martin", "S1007", "555-0107", "505 Willow Way"));
        students.add(Student("Hannah Lee", "S1008", "555-0108", "606 Aspen Pl"));
        students.add(Student("Ivan Petrov", "S1009", "555-0109", "707 Spruce Grv"));
    }

    companion object {
        val shared = Model()

    }
}
