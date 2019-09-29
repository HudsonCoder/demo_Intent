package com.example.demo_intent;

import java.io.Serializable;

public class Student implements Serializable {
    private String hoten;
    private String birthday;
    private String address;
    private String email;

    public Student(String hoten, String birthday, String address, String email) {
        this.hoten = hoten;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
