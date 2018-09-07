package com.example.blacknesswolf.calculapromedio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_contacto,btn_calcularPr,btn_calcularEx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button
        btn_contacto=findViewById(R.id.btn_contacto);
        btn_calcularPr=findViewById(R.id.btn_calcularPr);
        btn_calcularEx=findViewById(R.id.btn_calcularEx);

        btn_calcularPr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calcularPr=new Intent(MainActivity.this,Calculando.class);
                startActivity(calcularPr);
            }
        });
        btn_calcularEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calcularPE=new Intent(MainActivity.this,CalculandoE.class);
                startActivity(calcularPE);
            }
        });
        btn_contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contacto=new Intent(MainActivity.this,Contacto.class);
                startActivity(contacto);
            }
        });

    }

}
