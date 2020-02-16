package com.example.tugasprakmobile1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Kubus extends AppCompatActivity {

    private EditText et_panjang,et_lebar,et_tinggi;
    private Button btnVolume,btnPindah;
    private TextView tv_hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        et_panjang=findViewById(R.id.et_panjang);
        et_lebar=findViewById(R.id.et_lebar);
        et_tinggi=findViewById(R.id.et_tinggi);
        tv_hasil=findViewById(R.id.tv_hasil);
        btnVolume=findViewById(R.id.btnVolume);
        btnPindah=findViewById(R.id.btnPindah);

        btnVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    String sPanjang = et_panjang.getText().toString();
                    String sLebar = et_lebar.getText().toString();
                    String sTinggi = et_tinggi.getText().toString();

                    double panjang = Double.parseDouble(sPanjang);
                    double lebar = Double.parseDouble(sLebar);
                    double tinggi = Double.parseDouble(sTinggi);

                    double hasil = panjang * lebar * tinggi;

                    String sHasil = String.valueOf(hasil);
                    tv_hasil.setText(sHasil);

                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveintent = new Intent(Kubus.this, MainActivity.class);startActivity(moveintent);
            }
        });
    }
}
