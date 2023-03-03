package com.example.lab3frasescelebres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declaramos variable para el numero random
    private int numeroAleatorio;

    //declaramos variable para asignarle el tvNoRandom
    private TextView vNoRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instanciamos para acceder a ese recurso para cambiar una de sus propiedades.
        vNoRandom = (TextView) findViewById(R.id.tvNoRand);

    }


    //funcion que se ejecunta al precionar el boton Generar No.
    public void GenerarNumero(View view) {

        //generamos el numero random y lo colocamos en tvNoRand
        numeroAleatorio = (int)(Math.random()*3+1);
        vNoRandom.setText(Integer.toString(numeroAleatorio));

    }

    //funcion que que se ejecuta al precionar el boton MOSTRAR FRASE
    public void ImagenAutorFrase(View view) {

        //mandamos a abrir el ActivityImagenAutorFrase y le pasamos la variable de el numero random
        Intent intent = new Intent(this, ActivityImagenAutorFrase.class);
        intent.putExtra("NoEnviado", numeroAleatorio);
        startActivity(intent);
    }
}