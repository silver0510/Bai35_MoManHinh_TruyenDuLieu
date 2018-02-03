package com.example.sinki.bai35_momanhinh_truyendulieu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sinki.model.SinhVien;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyMoVaGoiDuLieu(View view) {
        Intent intent = new Intent(MainActivity.this,ManHinh2Activity.class);
        //đưa dữ liệu vào intent
        intent.putExtra("Kieu_boolean",true);
        intent.putExtra("Kieu_Char",'x');
        intent.putExtra("Kieu_Int",100);
        intent.putExtra("Kieu_Double",19.53);
        intent.putExtra("Kieu_Chuoi","Nghĩa Phạm");

        SinhVien nghia = new SinhVien(1,"Phạm Phú Nghĩa");
        intent.putExtra("sinhVien",nghia);

        startActivity(intent);
    }
}
