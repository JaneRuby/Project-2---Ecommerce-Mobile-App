package com.example.janerubygrissom.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by janerubygrissom on 7/28/16.
 */
public class ShoppingCartAdapter2 extends RecyclerView.Adapter<ShoppingCartViewHolder> {

    ArrayList<InventoryItem> mInventoryList;

    public ShoppingCartAdapter2(ArrayList<InventoryItem> mInventoryList) {
        this.mInventoryList = mInventoryList;
    }


    @Override
    public ShoppingCartViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.quick_card, parent, false);
        ShoppingCartViewHolder quickCardShoppingCartViewHolder = new ShoppingCartViewHolder(parentView);
        return quickCardShoppingCartViewHolder;
    }

    @Override
    public void onBindViewHolder(ShoppingCartViewHolder holder, int position) {
//        InventoryItem item = mInventoryList.get(position);

        Picasso.with(holder.getItemImage().getContext()).load(mInventoryList.get(position).getmWebsite()
        ).resize(600, 200)
                .centerInside()
                .into(holder.getItemImage());

//        holder.getItemImage().setImageResource(item.getImageResId());

        holder.getmCountryName().setText(mInventoryList.get(position).getDescription());





    }

    @Override
    public int getItemCount() {

        return mInventoryList.size();

    }
    
}
