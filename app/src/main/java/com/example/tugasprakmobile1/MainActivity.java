package com.example.tugasprakmobile1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnKubus,btnTabung;
    private TextView tv_hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_hasil=findViewById(R.id.tv_hasil);
        btnKubus=findViewById(R.id.btnKubus);
        btnTabung=findViewById(R.id.btnTabung);

        btnKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Kubus.class);
                startActivity(i);
            }
        });

        btnTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Tabung.class);
                startActivity(i);
            }
        });
    }
}
