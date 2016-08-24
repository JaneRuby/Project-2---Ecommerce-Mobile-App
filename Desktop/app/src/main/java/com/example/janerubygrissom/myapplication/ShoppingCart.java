package com.example.janerubygrissom.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class ShoppingCart extends AppCompatActivity {
    RecyclerView mRecyclerView;
    Button btnClear;
    Button btnCheckOut;
    QuickCardRecyclerAdapter adapter;
    DBHelper dbHelper;
    ShoppingCartAdapter2 shoppingCartAdapter2;

    ArrayList<InventoryItem> itemList;

    //creates shopping cart
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);

//        ShoppingCart = ShoppingCart.getInstance();

        btnClear = (Button) findViewById(R.id.btnCLear);
        btnCheckOut = (Button) findViewById(R.id.btnCheckOut);

        mRecyclerView = (RecyclerView) findViewById(R.id.shoppingCartRecyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(ShoppingCart.this, 4);
        mRecyclerView.setLayoutManager(gridLayoutManager);

//        data = dbhelper.getshoppingcartdata

        dbHelper = DBHelper.getInstance(this);

        if (dbHelper.getShoppingData().size() != 0) {
            itemList = dbHelper.getShoppingData();

            shoppingCartAdapter2 = new ShoppingCartAdapter2(itemList);

            mRecyclerView.setAdapter(shoppingCartAdapter2);

//            dbHelper.clearCartTableUponCheckout();
//            finish();
        }

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Toast.makeText(ShoppingCart.this, "You have just brought more Prince into your life! \n CONGRATS!", Toast.LENGTH_SHORT).show();

                dbHelper.deleteShoppingCart();
                itemList.clear();

                shoppingCartAdapter2.notifyDataSetChanged();
                finish();

//                mRecyclerView.setAdapter(shoppingCartAdapter2);


            }
        });

        btnCheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemList = dbHelper.getShoppingData();
                shoppingCartAdapter2 = new ShoppingCartAdapter2(itemList);
                mRecyclerView.setAdapter(shoppingCartAdapter2);

                Toast.makeText(ShoppingCart.this, "You have just brought more Prince into your life! \n CONGRATS!", Toast.LENGTH_SHORT).show();

            }
        });

        // TODO: 8/1/16 search shopping cart database and remove position

//        holder._________.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View view) {
//
//                InventoryItem.getInventoryItem().remove(position);
//                notifyItemRemoved(position);
//                notifyItemRangeChanged(position, InventoryItem.getmInventoryItem().size());
//                notifyDataSetChanged();
//
//                //delete stuff
//                return true;
//
//                Toast.makeText(ShoppingCart.this, "You have just removed a Prince", Toast.LENGTH_SHORT).show();
//
//
//            }
//        });

    }

}


