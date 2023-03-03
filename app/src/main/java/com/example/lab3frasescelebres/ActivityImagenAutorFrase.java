package com.example.lab3frasescelebres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityImagenAutorFrase extends AppCompatActivity {


    //declaramos variables
    private ImageView imgAutor;
    private TextView nombreAutor;
    private TextView fraseAutor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen_autor_frase);

        //numero random recivido
        Intent intent = getIntent();
        int NoRandom = intent.getIntExtra("NoEnviado", 0);

        //instanciamos para asignar y acceder a ese recurso para cambiar una de sus propiedades.
        imgAutor =  findViewById(R.id.imagenAutor);
        nombreAutor = findViewById(R.id.tvNomAutor);
        fraseAutor = findViewById(R.id.tvFrase);

        //dependiendo el numero random hacer lo siegiente
        if (NoRandom == 1){
            //colocamos en ese recurso sus respectivos respectivas propiedades
            imgAutor.setImageResource(R.drawable.aristoteles);
            nombreAutor.setText(R.string.Aristoteles);
            fraseAutor.setText(R.string.FraseAristóteles);
        }

        if (NoRandom == 2){
            //colocamos en ese recurso sus respectivos respectivas propiedades
            imgAutor.setImageResource(R.drawable.francis);
            nombreAutor.setText(R.string.SirFrancisBacon);
            fraseAutor.setText(R.string.FraseSirFrancisBacon);
        }

        if (NoRandom == 3){
            //colocamos en ese recurso sus respectivos respectivas propiedades
            imgAutor.setImageResource(R.drawable.balzac);
            nombreAutor.setText(R.string.HonoreDeBalzac);
            fraseAutor.setText(R.string.FraseHonoréDeBalzac);
        }

    }
}