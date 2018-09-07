package com.example.blacknesswolf.calculapromedio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculandoE extends AppCompatActivity {
    //Instanciamos
    private EditText et_epr1,et_epr2,et_epe1,et_epe2,et_eva1,et_eva2,et_eva3,et_eva4,et_resultado,et_notaExamen;
    private Button btn_EnviarE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculando_e);
        //Asignacion de objetos
        //Edit Text
        et_epr1 = (EditText) findViewById(R.id.et_epr1);
        et_epr2 = (EditText) findViewById(R.id.et_epr2);
        et_epe1 = (EditText) findViewById(R.id.et_epe1);
        et_epe2 = (EditText) findViewById(R.id.et_epe2);
        et_eva1 = (EditText) findViewById(R.id.et_eva1);
        et_eva2 = (EditText) findViewById(R.id.et_eva2);
        et_eva3 = (EditText) findViewById(R.id.et_eva3);
        et_eva4 = (EditText) findViewById(R.id.et_eva4);
        et_notaExamen = (EditText) findViewById(R.id.et_notaExamen);
        //Button
        btn_EnviarE=findViewById(R.id.btn_EnviarE);
        //TextViw

        btn_EnviarE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double epr1 = Double.parseDouble(et_epr1.getText().toString()) * 0.1;
                double epr2 = Double.parseDouble(et_epr2.getText().toString()) *0.15;
                double epe1 = Double.parseDouble(et_epe1.getText().toString()) *0.20;
                double epe2 = Double.parseDouble(et_epe2.getText().toString()) * 0.25;
                double epr1If = Double.parseDouble(et_epr1.getText().toString());
                double epr2If = Double.parseDouble(et_epr2.getText().toString());
                double epe1If = Double.parseDouble(et_epe1.getText().toString());
                double epe2If = Double.parseDouble(et_epe2.getText().toString());
                double eva1 = Double.parseDouble(et_eva1.getText().toString());
                double eva2 = Double.parseDouble(et_eva2.getText().toString());
                double eva3 = Double.parseDouble(et_eva3.getText().toString());
                double eva4 = Double.parseDouble(et_eva4.getText().toString());




                double notaExamen, resta, notaNecesaria;
                CharSequence text = " ";
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_LONG;
                double sumaEvas = eva1+eva2+eva3+eva4;
                double sumaEvasIF = sumaEvas/4;
                double promedioEvas = (sumaEvas/4) *0.3;
                double notaPresentacion = epr1+epr2+epe1+epe2+promedioEvas;
                notaPresentacion = Math.round(notaPresentacion*100.0)/100.0;

                if (et_notaExamen.getText().equals("null")|| et_notaExamen.getText().toString().isEmpty()){
                    if ((notaPresentacion<5.5)||(epr1If<4)||(epr2<4)||(epe1If<4)||(epe2If<4)||(sumaEvas<4)){
                        notaExamen=notaPresentacion*0.7;
                        resta=3.95-notaExamen;
                        notaNecesaria=resta/0.3;
                        notaNecesaria=Math.round(notaNecesaria*100.0)/100.0;
                        text="Nota de presentacion : "+notaPresentacion+"Nesesitas un :  "+notaNecesaria+"Para Aprobar el ramo ";
                        Toast toast=Toast.makeText(context,text,duration);
                        toast.show();
                    }else{
                        text = "Nesesitas un : " + notaPresentacion +" Para eximirte ";
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    } text = "Te Eximes con un : " + notaPresentacion;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }else{
                    double etNotaExamen = Double.parseDouble(et_notaExamen.getText().toString());
                    etNotaExamen = etNotaExamen * 0.3;
                    double notaFinal = etNotaExamen + (notaPresentacion*0.7);
                    notaFinal = Math.round(notaFinal*100.0)/100.0;
                    text = "Nota final: " + notaFinal;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
        });

    }
}
