package com.example.janerubygrissom.myapplication;

import android.app.SearchManager;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

public class Search extends AppCompatActivity {

    RecyclerView recyclerView;
    QuickCardRecyclerAdapter quickCardRecyclerAdapter;
    String query;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //if search happens, this pulls the results
        Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            query = intent.getStringExtra(SearchManager.QUERY);
            Cursor cursor = DBHelper.getInstance(this).getPrinceBySearch(query);
            Toast.makeText(Search.this, "Results: " + cursor.getCount(), Toast.LENGTH_SHORT).show();
        }

        //sets up results in grid layout

        recyclerView = (RecyclerView) findViewById(R.id.search_recycler_view);
        quickCardRecyclerAdapter = new QuickCardRecyclerAdapter(DBHelper.getInstance(this).getPrinceBySearch3(query));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);


//        categoryRecycler1.setLayoutManager(layoutManager);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(quickCardRecyclerAdapter);


        // TODO: recyclerview, adapter, load the results from cursor into the adapter
        // TODO: xml - recycler
        // mirror mainactivity, just change what you feed into the adapter.
    }
}
