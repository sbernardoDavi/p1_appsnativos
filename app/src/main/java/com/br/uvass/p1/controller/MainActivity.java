package com.br.uvass.p1.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.br.uvass.p1.R;
import com.br.uvass.p1.controller.adapter.ItemAdapter;
import com.br.uvass.p1.model.ItemNoticia;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView) ;

        ArrayList<ItemNoticia> ItemNoticias = new ArrayList<>();

        String autor = "Davi Bernardo";
        String data = "20 de outubro";
        String noticiaFull = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien.";

        ItemNoticias.add(new ItemNoticia(1, R.drawable.icon2, "13:00", "Noticia 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien.", autor, data, noticiaFull));
        ItemNoticias.add(new ItemNoticia(3, R.drawable.icon2, "13:00", "Noticia 3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien.", autor, data, noticiaFull));
        ItemNoticias.add(new ItemNoticia(2, R.drawable.icon2, "13:00", "Noticia 2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien.", autor, data, noticiaFull));
        ItemNoticias.add(new ItemNoticia(4, R.drawable.icon2, "13:00", "Noticia 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien.", autor, data, noticiaFull));
        ItemNoticias.add(new ItemNoticia(5, R.drawable.icon2, "13:00", "Noticia 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien.", autor, data, noticiaFull));
        ItemNoticias.add(new ItemNoticia(6, R.drawable.icon2, "13:00", "Noticia 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien.", autor, data, noticiaFull));
        ItemNoticias.add(new ItemNoticia(7, R.drawable.icon2, "13:00", "Noticia 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien.", autor, data, noticiaFull));
        ItemNoticias.add(new ItemNoticia(8, R.drawable.icon2, "13:00", "Noticia 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien.", autor, data, noticiaFull));

        ItemAdapter adapter = new ItemAdapter(this, R.layout.item_row, ItemNoticias);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                ItemNoticia listaNoticia = ItemNoticias.get(position);
                String titulo = (String) ((TextView) view.findViewById(R.id.titulo_noticia)).getText();
                String descricao = (String) ((TextView) view.findViewById(R.id.descricao_noticia)).getText();
                String autor = (String) ((TextView) view.findViewById(R.id.autor_noticia)).getText();
                String data = (String) ((TextView) view.findViewById(R.id.data_noticia)).getText();
                String hora = (String) ((TextView) view.findViewById(R.id.hora_noticia)).getText();
                String noticiaFull = (String) ((TextView) view.findViewById(R.id.noticia_completa)).getText();

                Intent intent = new Intent(MainActivity.this, DetailsNoticia.class);

                Bundle bundle = new Bundle();

                bundle.putString("titulo", titulo);
                bundle.putString("descricao", descricao);
                bundle.putString("autor", autor);
                bundle.putString("data", data);
                bundle.putString("hora", hora);
                bundle.putString("noticiaFull", noticiaFull);

                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

    }
}