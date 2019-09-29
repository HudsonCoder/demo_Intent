package com.example.demo_intent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<Student> listStudent;

    public StudentAdapter(Context context, int layout, ArrayList<Student> listStudent) {
        this.context = context;
        this.layout = layout;
        this.listStudent = listStudent;
    }

    @Override
    public int getCount() {
        return listStudent.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder{
        TextView txtTen;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            viewHolder.txtTen= (TextView)view.findViewById(R.id.txthoten);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder)view.getTag();

        }

        Student student= listStudent.get(i);
        viewHolder.txtTen.setText(student.getHoten());
        return view;
    }
}
