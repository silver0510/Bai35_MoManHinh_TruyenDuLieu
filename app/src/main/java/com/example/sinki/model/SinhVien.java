package com.example.sinki.model;

import java.io.Serializable;

/**
 * Created by Sinki on 8/26/2017.
 */

public class SinhVien implements Serializable {
    private int ma;
    private String ten;

    public SinhVien(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public SinhVien() {
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                '}';
    }
}
