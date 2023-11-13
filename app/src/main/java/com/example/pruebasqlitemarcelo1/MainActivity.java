package com.example.pruebasqlitemarcelo1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button irMainCrud = findViewById(R.id.btnIngresar);
        Button irMapa = findViewById(R.id.btnMapa);



        irMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cuando se hace clic en el botón
                Intent intent = new Intent(MainActivity.this, mapa.class);
                startActivity(intent);
            }
        });

        irMainCrud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mainCrud.class);
                startActivity(intent);
            }
        });

    }
}