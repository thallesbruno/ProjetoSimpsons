package com.android.testeviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ListaAdapter extends ArrayAdapter<Pessoa> {
    private Context contexto;
    private int resourceLayout;
    private List<Pessoa> listaPessoas;

    public ListaAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Pessoa> objects) {
        super(context, resource, objects);
        this.contexto = context;
        this.resourceLayout = resource;
        this.listaPessoas = objects;
    };

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(contexto).inflate(resourceLayout, parent, false);
        }

        Pessoa pessoa = listaPessoas.get(position);

        TextView txtNome = convertView.findViewById(R.id.txt01);
        TextView txtMatricula = convertView.findViewById(R.id.txt02);
        TextView txtStatus = convertView.findViewById(R.id.txt03);
        ImageView imgIcon = convertView.findViewById(R.id.img);

        txtNome.setText(pessoa.getNome());
        txtMatricula.setText(pessoa.getMatricula());
        txtStatus.setText(pessoa.getStatus());

        // Definir imagem (precisa estatr em drawable)
        //imgIcon.setImageResource(R.drawable.ic_launcher_foreground);

        int imageResource = contexto.getResources().getIdentifier(
                pessoa.getImg(), "drawable", contexto.getPackageName()
        );

        if (imageResource != 0) {
            imgIcon.setImageResource(imageResource);
        } else {
            imgIcon.setImageResource(R.drawable.ic_launcher_background); // Imagem padrão caso não encontre
        }

        return convertView;
    }
}
