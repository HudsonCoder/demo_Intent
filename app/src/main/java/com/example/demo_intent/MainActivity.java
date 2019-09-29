package com.example.demo_intent;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ListFragment;
public class MainActivity extends AppCompatActivity implements TruyVanStudent{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void DataStudent(Student student) {
       Fragment_Student_Info fragment_student_info=(Fragment_Student_Info)getSupportFragmentManager().findFragmentById(R.id.listinfo);
        fragment_student_info.SetInfo(student);
    }
}