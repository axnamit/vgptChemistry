package com.optimistic.amit.vgptchemistry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class twelveListTheory extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve_list_theory);
        recyclerView=findViewById(R.id.recylerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        chaptername();



        adapter=new MyAdapter2(listItems, this);
        recyclerView.setAdapter(adapter);
    }
    public  void chaptername() {

        ListItem listItem = new ListItem("solution");
        listItems.add(listItem);

        listItem = new ListItem("solid state");
        listItems.add(listItem);
        listItem = new ListItem("nuclear chemistry");
        listItems.add(listItem);
        listItem = new ListItem("chemical kinetics");
        listItems.add(listItem);
        listItem = new ListItem("eletrochemistry");
        listItems.add(listItem);
        listItem = new ListItem("surface chemistry");
        listItems.add(listItem);
        listItem = new ListItem("general principle of extraction");
        listItems.add(listItem);
        listItem = new ListItem("d and f block elements");
        listItems.add(listItem);
        listItem = new ListItem("coodination chemistry");
        listItems.add(listItem);
        listItem = new ListItem("purification and organic compounds");
        listItems.add(listItem);
        listItem = new ListItem("halogen containing compounds");
        listItems.add(listItem);
        listItem = new ListItem("alcohol,phenol and either");
        listItems.add(listItem);
        listItem = new ListItem("aldehydes and ketones");
        listItems.add(listItem);
        listItem = new ListItem("nitrogen containing compounds");
        listItems.add(listItem);
        listItem = new ListItem("polymers");
        listItems.add(listItem);
        listItem = new ListItem("biomolecules");
        listItems.add(listItem);
        listItem = new ListItem("chemistry in action");
        listItems.add(listItem);
    }
}
