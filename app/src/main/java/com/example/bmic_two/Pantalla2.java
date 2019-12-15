package com.example.bmic_two;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Pantalla2 extends Activity {
    EditText Resultado;
    TextView Categoria;
    private Bundle bundle;
    /**
     * En este metodo que se encarga de inicializar los componentes de nuestra segunda pantalla.
     * Traera los valores que se mandaron desde "MainActivity" mediante Intent.
     * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Resultado = findViewById(R.id.txt_Resultado);
        Categoria = findViewById(R.id.lbl_Categoria);

        bundle = getIntent().getExtras();
        String resul = bundle.getString("Resultado");
        String categ = bundle.getString("Categoria");

        Resultado.append(resul);
        Categoria.append(categ);

    }


}
