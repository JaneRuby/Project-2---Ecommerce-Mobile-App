package com.example.janerubygrissom.myapplication;

import android.app.SearchManager;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class SearchViewActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);

        if (Intent.ACTION_SEARCH.equals(getIntent().getAction())) {
            String query = getIntent().getStringExtra(SearchManager.QUERY);
            Cursor cursor = DBHelper.getInstance(this).getPrinceBySearch(query);


            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.homeRecycler_1);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(SearchViewActivity.this, 3);
//            QuickCardRecyclerAdapter adapter = new QuickCardRecyclerAdapter(__________________);

            TextView textView = (TextView) findViewById(R.id.card_view);
            textView.setText("Number of " + query + "s in the database: " + cursor.getCount());
        }
    }

}




//    if (cursor.moveToFirst()) {
//        Log.i(TAG, "Creating then returning Prince object");
//        inventory = new InventoryItem(
//                cursor.getInt(cursor.getColumnIndex(COL_LIST_ID)),
//                cursor.getString(cursor.getColumnIndex(COL_PRINCE_NAME)),
//                cursor.getString(cursor.getColumnIndex(COL_PRINCE_DESC));
//    });
//}
//
//}
