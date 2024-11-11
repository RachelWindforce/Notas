package com.example.notas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    EditText notanueva;
    Button agregar;
    ListView Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notanueva = findViewById(R.id.NotaNueva);
        agregar = findViewById(R.id.btnAgregar);
        Lista = findViewById(R.id.Notas);
    }

}