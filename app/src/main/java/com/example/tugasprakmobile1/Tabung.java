package com.example.tugasprakmobile1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Tabung extends AppCompatActivity {

    private EditText et_jari,et_tinggi;
    private Button btnVolume,btnPindaho;
    private TextView tv_hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        et_jari=findViewById(R.id.et_jari);
        et_tinggi=findViewById(R.id.et_tinggi);
        btnVolume=findViewById(R.id.btnVolume);
        tv_hasil=findViewById(R.id.tv_hasil);
        btnPindaho=findViewById(R.id.btnPindaho);

        btnVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    String sJari = et_jari.getText().toString();
                    String sTinggi = et_tinggi.getText().toString();

                    double jari = Double.parseDouble(sJari);
                    double tinggi = Double.parseDouble(sTinggi);

                    double hasil = 3.14 * jari*jari * tinggi;

                    String sHasil = String.valueOf(hasil);
                    tv_hasil.setText(sHasil);

                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnPindaho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveintent = new Intent(Tabung.this, MainActivity.class);startActivity(moveintent);
            }
        });
    }
}
