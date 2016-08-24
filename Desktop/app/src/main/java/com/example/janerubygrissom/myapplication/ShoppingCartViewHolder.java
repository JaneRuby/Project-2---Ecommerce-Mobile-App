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
    private TextView mPrinceName;


    public ShoppingCartViewHolder(final View itemView) {
        super(itemView);

        mItemImage = (ImageView) itemView.findViewById(R.id.prince_photo);
        mPrinceName = (TextView) itemView.findViewById(R.id.prince_name);
        itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                DBHelper.getInstance(itemView.getContext()).removePrinceFromShoppingCart(mPrinceName.getText().toString());

                return true;
            }
        });
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        itemView.setOnClickListener(onClickListener);
    }

    public ImageView getItemImage() {
        return mItemImage;
    }

    public TextView getmPrinceName() {
        return mPrinceName;
    }
}


