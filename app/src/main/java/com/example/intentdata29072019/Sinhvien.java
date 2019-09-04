package com.example.intentdata29072019;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Sinhvien implements Parcelable {
    private String ten;

    public Sinhvien(String ten) {
        this.ten = ten;
    }

    protected Sinhvien(Parcel in) {
        ten = in.readString();
    }

    public static final Creator<Sinhvien> CREATOR = new Creator<Sinhvien>() {
        @Override
        public Sinhvien createFromParcel(Parcel in) {
            return new Sinhvien(in);
        }

        @Override
        public Sinhvien[] newArray(int size) {
            return new Sinhvien[size];
        }
    };

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(ten);
    }
}
