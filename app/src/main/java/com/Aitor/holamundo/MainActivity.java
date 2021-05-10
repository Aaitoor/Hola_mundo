package com.Aitor.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtHola;
String[] frases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHola = findViewById(R.id.txtHola);

        frases =  new String[5];
        frases[0] = "Te va a tocar la loteria";
        frases[1] = "No vas a tener errores en el código";
        frases[2] = "Todos los alumnos aprobaran";
        frases[3] = "Me va a salir un proyecto muy chuli";
        frases[4] = "El domingo cuando vaya de excyursión, no va a llover";
    }

    public void generarSaludo(View view) {
        //Generar un numero aleatorio
        int num = (int)(Math.random()*5);
        //Mostrar frase del array
        txtHola.setText(frases[num]);


    }
}