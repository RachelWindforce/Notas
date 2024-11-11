package com.example.notas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

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

    public void AgregarNota(View view){
        String nota = notanueva.getText().toString();
        //Creo una lista
        ArrayList<String> notas = new ArrayList<String>();

        //Creo un adaptador para la lista con: contexto (this), android.R.layout.simple_list_item_1,nombre del array
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,notas);

        //Asigno el adaptador a la lista ya definida
        Lista.setAdapter(adaptador);

        if (nota.isEmpty()){
            Toast.makeText(this, "No puede ingresar una nota vacia", Toast.LENGTH_SHORT).show();
        }else{
            notas.add(nota);

        }
    }

}