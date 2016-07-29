package com.example.janerubygrissom.myapplication;

/**
 * Created by janerubygrissom on 7/26/16.
 */

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class QuickCardRecyclerAdapter extends RecyclerView.Adapter<QuickCardViewHolder> {

    ArrayList<InventoryItem> mInventoryList;

    public QuickCardRecyclerAdapter(ArrayList<InventoryItem> inventoryList) {
        mInventoryList = inventoryList;
    }

    @Override
    public QuickCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.quick_card, parent, false);
        QuickCardViewHolder quickCardViewHolder = new QuickCardViewHolder(parentView);
        return quickCardViewHolder;
    }

    @Override
    public void onBindViewHolder(QuickCardViewHolder holder, final int position) {
        InventoryItem item = mInventoryList.get(position);

        //need to input website

        Picasso.with(holder.getItemImage().getContext()).load(mInventoryList.get(position).getmWebsite()
        ).resize(600, 200)
                .centerInside()
                .into(holder.getItemImage());

//        holder.getItemImage().setImageResource(item.getImageResId());

        holder.getmCountryName().setText(mInventoryList.get(position).getDescription());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Added to Cart", Toast.LENGTH_SHORT).show();
                DBHelper dbHelper = DBHelper.getInstance(view.getContext());
                //object goes below, probably arraylist.get(position)
                Log.i("iiiiiiiiiii", mInventoryList.get(position).getDescription());
                dbHelper.insertShoppingCart(mInventoryList.get(position));

            }
        });


    }

    @Override
    public int getItemCount() {
        return mInventoryList.size();
    }
}
