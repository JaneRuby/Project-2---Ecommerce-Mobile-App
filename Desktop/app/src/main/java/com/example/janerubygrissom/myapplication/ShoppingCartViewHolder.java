package com.example.janerubygrissom.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by janerubygrissom on 7/28/16.
 */
public class ShoppingCartViewHolder extends RecyclerView.ViewHolder {
    private ImageView mItemImage;
    private TextView mCountryName;

    public ShoppingCartViewHolder(View itemView) {
        super(itemView);

        mItemImage = (ImageView) itemView.findViewById(R.id.prince_photo);
        mCountryName = (TextView) itemView.findViewById(R.id.prince_name);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        itemView.setOnClickListener(onClickListener);
    }

    public ImageView getItemImage() {
        return mItemImage;
    }

    public TextView getmCountryName() {
        return mCountryName;
    }
}


