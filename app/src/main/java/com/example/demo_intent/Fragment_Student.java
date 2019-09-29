package com.example.demo_intent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

public class Fragment_Student extends ListFragment {
    ArrayList<Student> list;
    StudentAdapter studentAdapter;
    TruyVanStudent truyVanStudent;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        list = new ArrayList<>();
        addArraySV();
        studentAdapter = new StudentAdapter(getActivity(), R.layout.row_student, list);
        //gan gia tri
        truyVanStudent = (TruyVanStudent)getActivity();


        setListAdapter(studentAdapter);

        return inflater.inflate(R.layout.fragment_student_list, container, false);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        truyVanStudent.DataStudent(list.get(position));

    }

    private void addArraySV() {
        list.add(new Student("Nguyễn Trọng Hiền", "2007", "TP HCM", "nguyentrongkhoid-ng@gmail.com"));
        list.add(new Student("Nguyễn Trọng Khôi", "2008", "TP HCM", "nguyentrongkhoid-ng@gmail.com"));

        list.add(new Student("Nguyễn Trọng Tiến", "2009", "TP HCM", "nguyentrongkhoid-ng@gmail.com"));
        list.add(new Student("Nguyễn Trọng Lương", "2010", "TP HCM", "nguyentrongkhoid-ng@gmail.com"));
        list.add(new Student("Nguyễn Trọng Hiền", "2006", "TP HCM", "nguyentrongkhoid-ng@gmail.com"));

    }
}
