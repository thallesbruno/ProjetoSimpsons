package com.android.testeviews;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = findViewById(R.id.lista); // criar a lista de itens

        Pessoa lisa = new Pessoa("Lisa Simpson",
                "200412212", "ok", "lisa_simpson");
        Pessoa homer = new Pessoa("Homer Simpson",
                "200412222", "off", "homer_simpson");
        Pessoa marge = new Pessoa("Marge Simpson",
                "200412221", "off", "marge_simpson");
        Pessoa bart = new Pessoa("Bart Simpson",
                "200412211", "ok", "bart_simpson");
        Pessoa bart2 = new Pessoa("Bart Simpson",
                "200412212", "ok", "bart_simpson");
        Pessoa bart3 = new Pessoa("Bart Simpson",
                "200412213", "ok", "bart_simpso");

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(lisa);
        pessoas.add(homer);
        pessoas.add(marge);
        pessoas.add(bart);
        pessoas.add(bart2);
        pessoas.add(bart3);

        ListaAdapter adapter = new ListaAdapter(this, R.layout.layout_lista, pessoas);
        lista.setAdapter(adapter);

    }
}