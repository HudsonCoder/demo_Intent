package com.example.demo_intent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_Student_Info extends Fragment {
    TextView hoten;
    TextView birthday;
    TextView adress;
    TextView email;
    View view;
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.fragment_student_info, container, false);
         anhxa();
        return view;
    }
    public void SetInfo(Student student){
    hoten.setText(student.getHoten());
        birthday.setText(student.getBirthday());
        adress.setText(student.getAddress());
        email.setText(student.getEmail());

    }

    public void anhxa(){
        hoten= (TextView)view.findViewById(R.id.hotentxt);
        birthday= (TextView)view.findViewById(R.id.txtbirthday);
        adress= (TextView)view.findViewById(R.id.txtadress);
        email= (TextView)view.findViewById(R.id.txtEmail);
    }
}
