package com.example.sinki.bai35_momanhinh_truyendulieu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sinki.model.SinhVien;

public class ManHinh2Activity extends AppCompatActivity {
    TextView txtKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh2);
        addControls();
    }

    private void addControls() {
        txtKetQua = (TextView) findViewById(R.id.txtKetQua);
        Intent intent = getIntent();
        boolean kieuBool = intent.getBooleanExtra("Kieu_boolean",false);
        char kieuChar = intent.getCharExtra("Kieu_Char",'w');
        int kieuInt = intent.getIntExtra("Kieu_Int",0);
        double kieuDouble = intent.getDoubleExtra("Kieu_Double",0.00);
        String kieuChuoi = intent.getStringExtra("Kieu_Chuoi");
        SinhVien sv = (SinhVien) intent.getSerializableExtra("sinhVien");

        txtKetQua.setText("Kiểu boolean = " + kieuBool + "\n" +
                          "Kiểu char = " + kieuChar + "\n" +
                          "Kiểu int = "+kieuInt+ "\n" +
                          "Kiểu double = "+kieuDouble+ "\n" +
                          "Kiểu Chuỗi = " + kieuChuoi+ "\n" +
                          "Kiểu đối tượng = "+sv);
    }
}
