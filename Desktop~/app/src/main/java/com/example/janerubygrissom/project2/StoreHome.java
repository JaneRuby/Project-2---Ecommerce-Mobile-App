package com.example.janerubygrissom.project2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class StoreHome extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton addToCart = (FloatingActionButton) findViewById(R.id.fab);
        addToCart.setOnClickListener(new View.OnClickListener() {
                             @Override
                              public void onClick(View view) {
                                 Toast.makeText(StoreHome.this, "Added to cart!", Toast.LENGTH_SHORT).show();



        ArrayList<InventoryItem> inventory = new ArrayList<>();
//        inventory.add(new InventoryItem("Lover Prince", "Emits Sexual Energy",
//                "love", 1, R.drawable.lover_prince));
//        inventory.add(new InventoryItem("Stylish Prince", "Emits Fashionable Energy", "style", 1,
//                 R.drawable.stylish_prince));
//        inventory.add(new InventoryItem("Bad Boy Prince", "Emits Bad Boy Energy",
//                "bad", 1, R.drawable.bad_boy_prince));


        inventory.add(new InventoryItem("Chic Prince", "U Got the Look",
                "http://esq.h-cdn.co/assets/16/07/1455654807-prince-passport.png"));
        inventory.add(new InventoryItem("Seductive Prince", "Darling Nikki",
                "http://40.media.tumblr.com/b14840388de0a84ba1f434cf51461446/tumblr_mng75xilXj1so1oyro1_1280.jpg"));
        inventory.add(new InventoryItem("Fashionable Prince", "Raspberry Beret",
                "https://freakshowbusiness.files.wordpress.com/2012/03/dana-lixenberg-prince-1994.jpg"));
        inventory.add(new InventoryItem("Romantic Prince", "I Would Die 4 U",
                "http://images4.fanpop.com/image/photos/17900000/Prince-prince-17904735-437-700.jpg"));
        inventory.add(new InventoryItem("Delicate Prince", "Diamonds and Pearls",
                "http://waytofamous.com/images/prince-03.jpg"));
        inventory.add(new InventoryItem("Introspective Prince", "Purple Rain",
                "http://diabolicalrabbit.com/wp-content/uploads/2016/04/Prince.jpeg"));
        inventory.add(new InventoryItem("Sassy Prince", "Little Red Corvette",
                "https://stylesource01.files.wordpress.com/2016/04/prince-3.jpg"));
        inventory.add(new InventoryItem("Wise Prince", "Baby I'm a Star",
                "https://cdn2.vox-cdn.com/thumbor/93ppXRjPyceyQrjzkR4dWD-FLOI=/0x120:2328x1672/1280x854/cdn0.vox-cdn.com/uploads/chorus_image/image/49369459/GettyImages-498348150.0.jpg"));
        inventory.add(new InventoryItem("Fun Prince", "1999",
                "http://cdn4.thr.com/sites/default/files/imagecache/scale_crop_768_433/2016/03/prince.jpg"));
        inventory.add(new InventoryItem("Unamused Prince", "Let's Go Crazy",
                "https://vice-images.vice.com/images/content-images-crops/2016/04/30/prince-didnt-invent-air-jordans-and-other-debunked-myths-body-image-1462032666-size_1000.jpg?resize=*:*&output-quality="));
        inventory.add(new InventoryItem("Suave Prince", "I Wanna Be Your Lover",
                "http://www.trbimg.com/img-571ea3b6/turbine/ct-prince-photos-20160421/1050/1050x591"));
        inventory.add(new InventoryItem("Venerable Prince", "When Doves Cry",
                "https://img.buzzfeed.com/buzzfeed-static/static/enhanced/webdr02/2013/8/26/16/enhanced-buzz-27011-1377549461-0.jpg"));




        DBHelper dbHelper = DBHelper.getInstance(StoreHome.this);
         dbHelper.insertMainInventory(new InventoryItem("Chic Prince", "U Got the Look",
                "http://esq.h-cdn.co/assets/16/07/1455654807-prince-passport.png"));
        dbHelper.insertMainInventory(new InventoryItem("Seductive Prince", "Darling Nikki",
                "http://40.media.tumblr.com/b14840388de0a84ba1f434cf51461446/tumblr_mng75xilXj1so1oyro1_1280.jpg"));

        dbHelper.insertMainInventory(new InventoryItem("Fashionable Prince", "Raspberry Beret",
                "https://freakshowbusiness.files.wordpress.com/2012/03/dana-lixenberg-prince-1994.jpg"));

        dbHelper.insertMainInventory(new InventoryItem("Romantic Prince", "I Would Die 4 U",
                "http://images4.fanpop.com/image/photos/17900000/Prince-prince-17904735-437-700.jpg"));

        dbHelper.insertMainInventory(new InventoryItem("Delicate Prince", "Diamonds and Pearls",
                "http://waytofamous.com/images/prince-03.jpg"));

        dbHelper.insertMainInventory(new InventoryItem("Introspective Prince", "Purple Rain",
                "http://diabolicalrabbit.com/wp-content/uploads/2016/04/Prince.jpeg"));

        dbHelper.insertMainInventory(new InventoryItem("Sassy Prince", "Little Red Corvette",
                "https://stylesource01.files.wordpress.com/2016/04/prince-3.jpg"));

        dbHelper.insertMainInventory(new InventoryItem("Wise Prince", "Baby I'm a Star",
                "https://cdn2.vox-cdn.com/thumbor/93ppXRjPyceyQrjzkR4dWD-FLOI=/0x120:2328x1672/1280x854/cdn0.vox-cdn.com/uploads/chorus_image/image/49369459/GettyImages-498348150.0.jpg"));

        dbHelper.insertMainInventory(new InventoryItem("Fun Prince", "1999",
                "http://cdn4.thr.com/sites/default/files/imagecache/scale_crop_768_433/2016/03/prince.jpg"));

        dbHelper.insertMainInventory(new InventoryItem("Delicate Prince", "Diamonds and Pearls",
                "http://waytofamous.com/images/prince-03.jpg"));

        dbHelper.insertMainInventory(new InventoryItem("Unamused Prince", "Let's Go Crazy",
                "https://vice-images.vice.com/images/content-images-crops/2016/04/30/prince-didnt-invent-air-jordans-and-other-debunked-myths-body-image-1462032666-size_1000.jpg?resize=*:*&output-quality="));

        dbHelper.insertMainInventory(new InventoryItem("Suave Prince", "I Wanna Be Your Lover",
                "http://www.trbimg.com/img-571ea3b6/turbine/ct-prince-photos-20160421/1050/1050x591"));

        dbHelper.insertMainInventory(new InventoryItem("Venerable Prince", "When Doves Cry",
                "https://img.buzzfeed.com/buzzfeed-static/static/enhanced/webdr02/2013/8/26/16/enhanced-buzz-27011-1377549461-0.jpg"));



        //get from sqlite, add to inventory
        //inventory.addAll(sqlitelist)


        //Instantiates RecyclerView and sets a horizontal layout managaer
        RecyclerView categoryRecycler1 = (RecyclerView) findViewById(R.id.homeRecycler_1);
//        RecyclerView categoryRecycler2 = (RecyclerView) findViewById(R.id.homeRecycler_2);
//        RecyclerView categoryRecycler3 = (RecyclerView) findViewById(R.id.homeRecycler_3);
//        RecyclerView categoryRecycler4 = (RecyclerView) findViewById(R.id.homeRecycler_4);


//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        //grid, number represents columns

        GridLayoutManager gridLayoutManager = new GridLayoutManager(StoreHome.this, 3);
//        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this,
//                LinearLayoutManager.HORIZONTAL, false);
//        LinearLayoutManager layoutManager3 = new LinearLayoutManager(this,
//                LinearLayoutManager.HORIZONTAL, false);
//        LinearLayoutManager layoutManager4 = new LinearLayoutManager(this,
//                LinearLayoutManager.HORIZONTAL, false);


//        categoryRecycler1.setLayoutManager(layoutManager);
        categoryRecycler1.setLayoutManager(gridLayoutManager);
//        categoryRecycler2.setLayoutManager(layoutManager2);
//        categoryRecycler3.setLayoutManager(layoutManager3);
//        categoryRecycler4.setLayoutManager(layoutManager4);


        QuickCardRecyclerAdapter cardRecyclerAdapter = new QuickCardRecyclerAdapter(inventory);
        categoryRecycler1.setAdapter(cardRecyclerAdapter);
//        categoryRecycler2.setAdapter(cardRecyclerAdapter);
//        categoryRecycler3.setAdapter(cardRecyclerAdapter);
//        categoryRecycler4.setAdapter(cardRecyclerAdapter);


//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.setDrawerListener(toggle);
//        toggle.syncState();
//
//    }
//
//    @Override
//    public void onBackPressed() {
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.store_home, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    @SuppressWarnings("StatementWithEmptyBody")
//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//
//        if (id == R.id.nav_camera) {
//            // Handle the camera action
//        } else if (id == R.id.nav_gallery) {
//
//        } else if (id == R.id.nav_slideshow) {
//
//        } else if (id == R.id.nav_manage) {
//
//        } else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
//
//        }
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }
}
    });
    }
}