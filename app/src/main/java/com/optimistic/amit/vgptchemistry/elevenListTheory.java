package com.optimistic.amit.vgptchemistry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class elevenListTheory extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<ListItem> listItems=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven_list_theory);
        recyclerView=findViewById(R.id.recylerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        chaptername();



        adapter=new MyAdapter(listItems, this);
        recyclerView.setAdapter(adapter);
    }
    public  void chaptername() {

        ListItem listItem = new ListItem("chemical airthmetic");
        listItems.add(listItem);

        listItem = new ListItem("atomic structures");
        listItems.add(listItem);
        listItem = new ListItem("chemical bonding");
        listItems.add(listItem);
        listItem = new ListItem("gaseous state");
        listItems.add(listItem);
        listItem = new ListItem("chemical equilibrium");
        listItems.add(listItem);
        listItem = new ListItem("ionic equilibrium");
        listItems.add(listItem);
        listItem = new ListItem("theromodynamics");
        listItems.add(listItem);
        listItem = new ListItem("redox reactions");
        listItems.add(listItem);
        listItem = new ListItem("chemical periodicity");
        listItems.add(listItem);
        listItem = new ListItem("hydrogen and it's compound");
        listItems.add(listItem);
        listItem = new ListItem("s and p block elements");
        listItems.add(listItem);
        listItem = new ListItem("chemical analysis");
        listItems.add(listItem);
        listItem = new ListItem("general organic chemistry");
        listItems.add(listItem);
        listItem = new ListItem("hydrocarbons");
        listItems.add(listItem);
        listItem = new ListItem("carboxylic acids and their derivatives");
        listItems.add(listItem);
    }
}
