package com.example.notas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText notanueva;
    Button agregar, eliminar;
    ListView Lista;

    Spinner spinner;
    ArrayList<String> lista;
    ArrayAdapter<String> adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notanueva = findViewById(R.id.NotaNueva);
        agregar = findViewById(R.id.btnAgregar);
        eliminar = findViewById(R.id.eliminar);
        Lista = findViewById(R.id.Notas);
        spinner = findViewById(R.id.Spinner);
        lista = new ArrayList<String>();
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        Lista.setAdapter(adaptador);
        spinner.setAdapter(adaptador);



    }

    public void AgregarNota(View view){
        String nota = notanueva.getText().toString();

        if (nota.isEmpty()){
            Toast.makeText(this, "No se puede ingresar una nota vacia", Toast.LENGTH_SHORT).show();
        }else{
            lista.add(nota);
            adaptador.notifyDataSetChanged();
            notanueva.setText("");

        }

    }

    public void  EliminarNota (View view){
        String nota = (String) spinner.getSelectedItem();

        if (nota == null){
            Toast.makeText(this, "Porfavor selecciona una nota para eliminar", Toast.LENGTH_SHORT).show();
        }else {
            lista.remove(nota);
            adaptador.notifyDataSetChanged();
        }
    }

}