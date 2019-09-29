package com.example.demo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent= getIntent();
        Student student= (Student) intent.getSerializableExtra("infosv");
        Fragment_Student_Info fragment_student_info= (Fragment_Student_Info) getSupportFragmentManager().findFragmentById(R.id.fragmenttrang2);
        fragment_student_info.SetInfo(student);
    }
}
