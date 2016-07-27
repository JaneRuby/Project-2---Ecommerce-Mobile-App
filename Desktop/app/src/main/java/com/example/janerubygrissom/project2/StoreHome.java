package com.example.janerubygrissom.project2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class StoreHome extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Shopping Cart", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ArrayList<InventoryItem> inventory = new ArrayList<>();
//        inventory.add(new InventoryItem("Lover Prince", "Emits Sexual Energy",
//                "love", 1, R.drawable.lover_prince));
//        inventory.add(new InventoryItem("Stylish Prince", "Emits Fashionable Energy", "style", 1,
//                 R.drawable.stylish_prince));
//        inventory.add(new InventoryItem("Bad Boy Prince", "Emits Bad Boy Energy",
//                "bad", 1, R.drawable.bad_boy_prince));





        inventory.add(new InventoryItem("Bad Boy Prince", "Emits Bad Boy Energy",
                "http://www.trbimg.com/img-571ea3b6/turbine/ct-prince-photos-20160421/1050/1050x591"));
        inventory.add(new InventoryItem("Cool Prince", "Emits Cool Energy",
                "http://i.dailymail.co.uk/i/pix/2016/04/24/19/336A2A9400000578-3556513-image-m-8_1461521224235.jpg"));
        inventory.add(new InventoryItem("Pretty Prince", "Emits Pretty Energy",
                "http://ll-media.tmz.com/2016/04/26/42616-prince-getty-13.jpg"));




        DBHelper dbHelper = DBHelper.getInstance(this);
        dbHelper.insertMainInventory(new InventoryItem("Bad Boy Prince", "Emits Bad Boy Energy",
                "http://www.trbimg.com/img-571ea3b6/turbine/ct-prince-photos-20160421/1050/1050x591"));

        //get from sqlite, add to inventory
        //inventory.addAll(sqlitelist)


        //Instantiates RecyclerView and sets a horizontal layout managaer
        RecyclerView categoryRecycler1 = (RecyclerView) findViewById(R.id.homeRecycler_1);
//        RecyclerView categoryRecycler2 = (RecyclerView) findViewById(R.id.homeRecycler_2);
//        RecyclerView categoryRecycler3 = (RecyclerView) findViewById(R.id.homeRecycler_3);
//        RecyclerView categoryRecycler4 = (RecyclerView) findViewById(R.id.homeRecycler_4);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        //grid, number represents columns

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
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


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.store_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}