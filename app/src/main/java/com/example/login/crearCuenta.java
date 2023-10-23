package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class crearCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);

        Button btn2 = findViewById(R.id.btn2);
        Button back = findViewById(R.id.button);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(getApplicationContext(), MenuDashboard.class);
                startActivity(intento);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent(getApplicationContext(), LoginLayout.class);
                startActivity(intento2);
            }
        });
    }
}