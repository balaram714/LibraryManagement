package com.example.librarymanagement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

public class StudentPage : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_p_age)
        val bottomNevagition:BottomNavigationView=findViewById(R.id.bottom_nevigation_id)
        val navController=findNavController(R.id.fragment)
        val appbarConfigaretion= AppBarConfiguration(setOf(R.id.firstFragment,R.id.secondFragment,R.id.thirdFragment))
        setupActionBarWithNavController(navController,appbarConfigaretion)
        bottomNevagition.setupWithNavController(navController)
    }
}