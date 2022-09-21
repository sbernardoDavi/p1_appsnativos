package com.br.uvass.p1.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.br.uvass.p1.R;
import com.br.uvass.p1.controller.adapter.ItemAdapter;
import com.br.uvass.p1.model.item;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView) ;

        ArrayList<item> items = new ArrayList<>();

        items.add(new item(1, R.drawable.icon2, "13:00", "Noticia 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien."));
        items.add(new item(3, R.drawable.icon2, "13:00", "Noticia 3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien."));
        items.add(new item(2, R.drawable.icon2, "13:00", "Noticia 2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien."));
        items.add(new item(4, R.drawable.icon2, "13:00", "Noticia 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien."));
        items.add(new item(5, R.drawable.icon2, "13:00", "Noticia 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien."));
        items.add(new item(6, R.drawable.icon2, "13:00", "Noticia 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien."));
        items.add(new item(7, R.drawable.icon2, "13:00", "Noticia 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien."));
        items.add(new item(8, R.drawable.icon2, "13:00", "Noticia 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at ullamcorper sapien, quis dignissim lacus. Curabitur eu lorem ligula. Mauris gravida quis velit a auctor. Integer placerat, sapien ac mollis placerat, lorem urna interdum libero, nec lobortis ex ante ut sapien."));

        ItemAdapter itemAdapter = new ItemAdapter(this, R.layout.item_row, items);

        listView.setAdapter(itemAdapter);

    }
}