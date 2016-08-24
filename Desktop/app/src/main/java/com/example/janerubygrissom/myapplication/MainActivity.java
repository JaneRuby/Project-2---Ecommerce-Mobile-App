package com.example.janerubygrissom.myapplication;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Main2Activity {
    QuickCardRecyclerAdapter cardRecyclerAdapter;
    ArrayList<InventoryItem> inventory;
    RecyclerView categoryRecycler1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        Intent intent = getIntent();
//        if (Intent.ACTION_SEARCH.equals(intent.getAction())){
//            String query = intent.getStringExtra(SearchManager.QUERY);
//         Cursor cursor = DBHelper.getInstance(this).getPrinceBySearch(query);
//
//            Toast.makeText(MainActivity.this, "Results: "+cursor.getCount(), Toast.LENGTH_SHORT).show();
//
//        }


//        Intent intent = new Intent(Intent.ACTION_SEARCH);
//        intent.putExtra(SearchManager.QUERY, "");
//        onNewIntent(intent);


        //Instantiates RecyclerView and sets a horizontal layout managaer
        categoryRecycler1 = (RecyclerView) findViewById(R.id.homeRecycler_1);


//        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        //grid, number represents columns

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 4);


//        categoryRecycler1.setLayoutManager(layoutManager);
        categoryRecycler1.setLayoutManager(gridLayoutManager);


//Cursor
//        Cursor cursor = (Cursor) DBHelper.getInstance(this);


        inventory = new ArrayList<>();

//
//        inventory.add(new InventoryItem("Chic Prince", "Chic Prince", "U Got the Look",
//                "http://esq.h-cdn.co/assets/16/07/1455654807-prince-passport.png"));
//        inventory.add(new InventoryItem("Seductive Prince", "Seductive Prince", "Darling Nikki",
//                "http://40.media.tumblr.com/b14840388de0a84ba1f434cf51461446/tumblr_mng75xilXj1so1oyro1_1280.jpg"));
//        inventory.add(new InventoryItem("Fashionable Prince", "Fashionable Prince", "Raspberry Beret",
//                "https://freakshowbusiness.files.wordpress.com/2012/03/dana-lixenberg-prince-1994.jpg"));
//        inventory.add(new InventoryItem("Romantic Prince", "Romantic Prince", "I Would Die 4 U",
//                "http://www.ouest-france.fr/sites/default/files/styles/image-640/public/2016/04/22/comment-prince-cherche-tout-prix-devenir-un-sex-symbol_0.jpg?itok=DRnq8sTt"));
//        inventory.add(new InventoryItem("Fancy Prince", "Fancy Prince", "Kiss",
//                "http://images2.fanpop.com/image/photos/11900000/prince-prince-11935710-500-500.jpg"));
//        inventory.add(new InventoryItem("Introspective Prince", "Introspective Prince", "Purple Rain",
//                "http://diabolicalrabbit.com/wp-content/uploads/2016/04/Prince.jpeg"));
//        inventory.add(new InventoryItem("Sassy Prince", "Sassy Prince", "Little Red Corvette",
//                "https://stylesource01.files.wordpress.com/2016/04/prince-3.jpg"));
//        inventory.add(new InventoryItem("Wise Prince", "Wise Prince", "Baby I'm a Star",
//                "https://cdn2.vox-cdn.com/thumbor/93ppXRjPyceyQrjzkR4dWD-FLOI=/0x120:2328x1672/1280x854/cdn0.vox-cdn.com/uploads/chorus_image/image/49369459/GettyImages-498348150.0.jpg"));
//        inventory.add(new InventoryItem("Fun Prince", "Fun Prince", "1999",
//                "http://cdn4.thr.com/sites/default/files/imagecache/scale_crop_768_433/2016/03/prince.jpg"));
//        inventory.add(new InventoryItem("Unamused Prince", "Unamused Prince", "Let's Go Crazy",
//                "https://vice-images.vice.com/images/content-images-crops/2016/04/30/prince-didnt-invent-air-jordans-and-other-debunked-myths-body-image-1462032666-size_1000.jpg?resize=*:*&output-quality="));
//        inventory.add(new InventoryItem("Suave Prince", "Suave Prince", "I Wanna Be Your Lover",
//                "http://www.trbimg.com/img-571ea3b6/turbine/ct-prince-photos-20160421/1050/1050x591"));
//        inventory.add(new InventoryItem("Playful Prince", "Playful Prince", "Batdance",
//                "http://i150.photobucket.com/albums/s102/tricky2_2007/parade0001.jpg"));
//        inventory.add(new InventoryItem("Preoccupied Prince", "Preoccupied Prince", "Alphabet St.",
//                "http://img.wennermedia.com/620-width/prince-2-3a0df3d9-6b2a-4127-b069-7a565df08082.jpg"));
//        inventory.add(new InventoryItem("Venerable Prince", "Venerable Prince", "When Doves Cry",
//                "https://img.buzzfeed.com/buzzfeed-static/static/enhanced/webdr02/2013/8/26/16/enhanced-buzz-27011-1377549461-0.jpg"));
//        inventory.add(new InventoryItem("Delicate Prince", "Delicate Prince", "Diamonds and Pearls",
//                "http://waytofamous.com/images/prince-03.jpg"));
//        inventory.add(new InventoryItem("Thoughtful Prince", "Thoughtful Prince", "The Beautiful Ones",
//                "http://www.newyorker.com/wp-content/uploads/2016/04/Prince-Death-Slideshow01-1200x630-1461261685.jpg"));


//        inventory.add(new InventoryItem("________1 Prince", "___________1 Prince", "_____________1",
//                "http://cdn4.pitchfork.com/news/64980/120b0415.jpg"));

        //        inventory.add(new InventoryItem("________2 Prince", "___________2 Prince", "_____________2",
//                "https://troubleddiva.files.wordpress.com/2016/03/15-prince-lovesexy.jpg"));

        //        inventory.add(new InventoryItem("________3 Prince", "___________3 Prince", "_____________3",
//                "http://images6.fanpop.com/image/photos/37100000/It-s-Prince-prince-37137421-498-404.jpg"));

        //        inventory.add(new InventoryItem("________4 Prince", "___________4 Prince", "_____________4",
//                "https://cdn2.vox-cdn.com/thumbor/Wbls9zGoJVkwmVCwcDYMs4xWWrI=/0x0:2012x1341/1280x854/cdn0.vox-cdn.com/uploads/chorus_image/image/46658760/GettyImages-463035206.0.jpg"));

        //        inventory.add(new InventoryItem("________5 Prince", "___________5 Prince", "_____________5",
//                "http://www.billboard.com/files/styles/article_main_image/public/media/prince-under-the-cherry-moon-1986-billboard-650.jpg"));

        //        inventory.add(new InventoryItem("________6 Prince", "___________6 Prince", "_____________6",
//                "https://static01.nyt.com/images/2016/04/21/t-magazine/PRINCESTYLE-SS-slide-9QJM/PRINCESTYLE-SS-slide-9QJM-superJumbo-v4.jpg"));

        //        inventory.add(new InventoryItem("________7 Prince", "___________7 Prince", "_____________7",
//                "http://img2.timeinc.net/people/i/2016/news/160502/prince-obit-4-660.jpg"));

        //        inventory.add(new InventoryItem("________8 Prince", "___________8 Prince", "_____________8",
//                "http://ll-media.tmz.com/2016/04/15/041516-prince-getty-6.jpg"));

        //        inventory.add(new InventoryItem("________9 Prince", "___________9 Prince", "_____________9",
//                "http://pixel.nymag.com/imgs/daily/vulture/2016/04/21/prince/21-prince-1.w529.h529.jpg"));

        //        inventory.add(new InventoryItem("________10 Prince", "___________10 Prince", "_____________10",
//                "http://cdn-media.extratv.com/2016/04/21/prince-825x580-2.jpg"));

        //        inventory.add(new InventoryItem("________11 Prince", "___________11 Prince", "_____________11",
//                "http://img2-2.timeinc.net/people/i/2016/news/160502/prince-cc-600.jpg"));


        // TODO: 8/1/16 placeholder images

        DBHelper dbHelper = DBHelper.getInstance(MainActivity.this);

        if (dbHelper.getPrinceBySearch3("").size() == 0) {
            dbHelper.insertMainInventory(new InventoryItem("Chic Prince", "Chic Prince", "U Got the Look",
                    "http://esq.h-cdn.co/assets/16/07/1455654807-prince-passport.png"));
            dbHelper.insertMainInventory(new InventoryItem("Seductive Prince", "Seductive Prince", "Darling Nikki",
                    "http://40.media.tumblr.com/b14840388de0a84ba1f434cf51461446/tumblr_mng75xilXj1so1oyro1_1280.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Fashionable Prince", "Fashionable Prince", "Raspberry Beret",
                    "https://freakshowbusiness.files.wordpress.com/2012/03/dana-lixenberg-prince-1994.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Romantic Prince", "Romantic Prince", "I Would Die 4 U",
                    "http://www.ouest-france.fr/sites/default/files/styles/image-640/public/2016/04/22/comment-prince-cherche-tout-prix-devenir-un-sex-symbol_0.jpg?itok=DRnq8sTt"));

            dbHelper.insertMainInventory(new InventoryItem("Fancy Prince", "Fancy Prince", "Kiss",
                    "http://images2.fanpop.com/image/photos/11900000/prince-prince-11935710-500-500.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Reflective Prince", "Reflective Prince", "Purple Rain",
                    "http://diabolicalrabbit.com/wp-content/uploads/2016/04/Prince.jpeg"));

            dbHelper.insertMainInventory(new InventoryItem("Sassy Prince", "Sassy Prince", "Little Red Corvette",
                    "https://stylesource01.files.wordpress.com/2016/04/prince-3.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Wise Prince", "Wise Prince", "Baby I'm a Star",
                    "https://cdn2.vox-cdn.com/thumbor/93ppXRjPyceyQrjzkR4dWD-FLOI=/0x120:2328x1672/1280x854/cdn0.vox-cdn.com/uploads/chorus_image/image/49369459/GettyImages-498348150.0.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Fun Prince", "Fun Prince", "1999",
                    "http://cdn4.thr.com/sites/default/files/imagecache/scale_crop_768_433/2016/03/prince.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Delicate Prince", "Delicate Prince", "Diamonds and Pearls",
                    "http://waytofamous.com/images/prince-03.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Unamused Prince", "Unamused Prince", "Let's Go Crazy",
                    "https://vice-images.vice.com/images/content-images-crops/2016/04/30/prince-didnt-invent-air-jordans-and-other-debunked-myths-body-image-1462032666-size_1000.jpg?resize=*:*&output-quality="));

            dbHelper.insertMainInventory(new InventoryItem("Suave Prince", "Suave Prince", "I Wanna Be Your Lover",
                    "http://www.trbimg.com/img-571ea3b6/turbine/ct-prince-photos-20160421/1050/1050x591"));

            dbHelper.insertMainInventory(new InventoryItem("Playful Prince", "Playful Prince", "Batdance",
                    "http://i150.photobucket.com/albums/s102/tricky2_2007/parade0001.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Preoccupied Prince", "Preoccupied Prince", "Alphabet St.",
                    "http://img.wennermedia.com/620-width/prince-2-3a0df3d9-6b2a-4127-b069-7a565df08082.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Venerable Prince", "Venerable Prince", "When Doves Cry",
                    "https://img.buzzfeed.com/buzzfeed-static/static/enhanced/webdr02/2013/8/26/16/enhanced-buzz-27011-1377549461-0.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Delicate Prince", "Delicate Prince", "Diamonds and Pearls",
                    "http://waytofamous.com/images/prince-03.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Thoughtful Prince", "Thoughtful Prince", "The Beautiful Ones",
                    "http://www.newyorker.com/wp-content/uploads/2016/04/Prince-Death-Slideshow01-1200x630-1461261685.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Puzzled Prince", "Puzzled Prince", "_____________1",
                    "http://cdn4.pitchfork.com/news/64980/120b0415.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Naughty Prince", "Naughty Prince", "_____________2",
                    "https://troubleddiva.files.wordpress.com/2016/03/15-prince-lovesexy.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("BFF Prince", "BFF Prince", "_____________3",
                    "http://images6.fanpop.com/image/photos/37100000/It-s-Prince-prince-37137421-498-404.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Glam Prince", "Glam Prince", "_____________4",
                    "https://cdn2.vox-cdn.com/thumbor/Wbls9zGoJVkwmVCwcDYMs4xWWrI=/0x0:2012x1341/1280x854/cdn0.vox-cdn.com/uploads/chorus_image/image/46658760/GettyImages-463035206.0.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Punk Prince", "Punk Prince", "_____________5",
                    "http://www.billboard.com/files/styles/article_main_image/public/media/prince-under-the-cherry-moon-1986-billboard-650.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Soft Prince", "Soft Prince", "_____________6",
                    "https://static01.nyt.com/images/2016/04/21/t-magazine/PRINCESTYLE-SS-slide-9QJM/PRINCESTYLE-SS-slide-9QJM-superJumbo-v4.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Powerful Prince", "Powerful Prince", "_____________7",
                    "http://img2.timeinc.net/people/i/2016/news/160502/prince-obit-4-660.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Proud Prince", "Proud Prince", "_____________8",
                    "http://ll-media.tmz.com/2016/04/15/041516-prince-getty-6.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Timeless Prince", "Timeless Prince", "_____________9",
                    "http://pixel.nymag.com/imgs/daily/vulture/2016/04/21/prince/21-prince-1.w529.h529.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Haughty Prince", "Haughty Prince", "_____________10",
                    "http://cdn-media.extratv.com/2016/04/21/prince-825x580-2.jpg"));

            dbHelper.insertMainInventory(new InventoryItem("Haunting Prince", "Hauntiny Prince", "_____________11",
                    "http://img2-2.timeinc.net/people/i/2016/news/160502/prince-cc-600.jpg"));

        }


        inventory = dbHelper.getPrinceBySearch3("");

        cardRecyclerAdapter = new QuickCardRecyclerAdapter(inventory);
        categoryRecycler1.setAdapter(cardRecyclerAdapter);
        //get from sqlite, add to inventory
        //inventory.addAll(sqlitelist)

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);


        if (Intent.ACTION_SEARCH.equals(getIntent().getAction())) {
            String query = getIntent().getStringExtra(SearchManager.QUERY);
            Cursor cursor = DBHelper.getInstance(this).getPrinceBySearch(query);


            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.homeRecycler_1);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 3);
//            QuickCardRecyclerAdapter adapter = new QuickCardRecyclerAdapter(__________________);
//            cardRecyclerAdapter = new QuickCardRecyclerAdapter(DBHelper.getInstance(this).getPrinceBySearch3(query));
            cardRecyclerAdapter = new QuickCardRecyclerAdapter(inventory);
            recyclerView.setAdapter(cardRecyclerAdapter);

            Toast.makeText(MainActivity.this, "Test "+cursor.getCount(), Toast.LENGTH_SHORT).show();


//            TextView textView = (TextView) findViewById(R.id.card_view);
//            textView.setText("Number of " + query + "s in the database: " + cursor.getCount());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_store_home, menu);


        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();

//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                if (newText.trim().equals("")) {
//                    Intent intent = new Intent(Intent.ACTION_SEARCH);
//                    intent.putExtra(SearchManager.QUERY, "");
//                    onNewIntent(intent);
//                }
//
//                return false;
//            }
//        });
        ComponentName componentName = new ComponentName(this, Search.class);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName));
//
        return true;
    }

    //    @Override
//    protected void onNewIntent(Intent intent) {
//        super.onNewIntent(intent);
//
//        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
//            String query = intent.getStringExtra(SearchManager.QUERY);
//
//            DBHelper dbHelper = DBHelper.getInstance(this);
//
//            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, GridLayoutManager.VERTICAL, false);
//            QuickCardRecyclerAdapter.setLayoutManager(gridLayoutManager);
//
//
//            cardRecyclerAdapter = new QuickCardRecyclerAdapter(this, cursor);
//            QuickCardRecyclerAdapter.setAdapter(cardRecyclerAdapter);
//        }
//    }
//
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.shopping:
                Intent i = new Intent(MainActivity.this, ShoppingCart.class);
                startActivity(i);


        }

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

}

