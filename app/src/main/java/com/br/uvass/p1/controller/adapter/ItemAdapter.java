package com.br.uvass.p1.controller.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.br.uvass.p1.R;
import com.br.uvass.p1.model.item;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<item> {

    private Context myContext;
    private int myResource;


    public ItemAdapter(@NonNull Context context, int resource, @NonNull ArrayList<item> objects) {
        super(context, resource, objects);
        this.myContext = context;
        this.myResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(myContext);

        convertView = layoutInflater.inflate(myResource, parent, false);
        ImageView imageView = convertView.findViewById(R.id.item_imagem);
        TextView textViewHora = convertView.findViewById(R.id.item_hora);
        TextView textViewTitulo = convertView.findViewById(R.id.item_titulo);
        TextView textViewDescricao = convertView.findViewById(R.id.item_descricao);

        imageView.setImageResource(getItem(position).getFoto());
        textViewHora.setText(getItem(position).getHora());
        textViewTitulo.setText(getItem(position).getTitulo());
        textViewDescricao.setText(getItem(position).getDescricao());



        return convertView;
    }
}


