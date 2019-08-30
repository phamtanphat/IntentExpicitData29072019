package com.example.intentdata29072019;

import java.io.Serializable;

public class Sinhvien implements Serializable {
    private String ten;

    public Sinhvien(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
