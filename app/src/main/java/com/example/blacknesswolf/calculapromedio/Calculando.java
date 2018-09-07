package com.example.blacknesswolf.calculapromedio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculando extends AppCompatActivity {
    //Instanciamos
    private EditText et_epr1,et_epr2,et_epe1,et_epe2,et_eva1,et_eva2,et_eva3,et_eva4,et_resultado;
    private Button btn_calcularP;
    private TextView tv_resultado
            ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculando);
        //Asignacion de objetos
        //Edit Text
        et_epr1=findViewById(R.id.et_epr1);
        et_epr2=findViewById(R.id.et_epr2);
        et_epe1=findViewById(R.id.et_epe1);
        et_epe2=findViewById(R.id.et_epe2);
        et_eva1=findViewById(R.id.et_eva1);
        et_eva2=findViewById(R.id.et_eva2);
        et_eva3=findViewById(R.id.et_eva3);
        et_eva4=findViewById(R.id.et_eva4);
        //Button
        btn_calcularP=findViewById(R.id.btn_calcularP);
        //TextViw


        btn_calcularP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float epr1 =Float.parseFloat(et_epr1.getText().toString());
                float epr2=Float.parseFloat(et_epr2.getText().toString());
                float epe1=Float.parseFloat(et_epe1.getText().toString());
                float epe2=Float.parseFloat(et_epe2.getText().toString());
                float eva1=Float.parseFloat(et_eva1.getText().toString());
                float eva2=Float.parseFloat(et_eva2.getText().toString());
                float eva3=Float.parseFloat(et_eva3.getText().toString());
                float eva4=Float.parseFloat(et_eva4.getText().toString());


                double EPR1=epr1*0.10;
                double EPR2=epr2*0.20;
                double EPE1=epe1*0.15;
                double EPE2=epe2*0.25;
                double sumaEvas=eva1+eva2+eva3+eva4;
                double Evas=sumaEvas/4;
                double totalEvas=sumaEvas*0.30;
                double promedio =epr1+epr2+epe1+epe2+totalEvas;
                double notaPresentacionFix = promedio;


                Toast toast1 = Toast.makeText(getApplicationContext(), "Tu Promedio es : "+promedio, Toast.LENGTH_SHORT);

               toast1.show();


            }
        });
    }
}
