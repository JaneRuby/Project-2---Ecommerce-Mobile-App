package com.example.janerubygrissom.project2;

/**
 * Created by janerubygrissom on 7/26/16.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class QuickCardViewHolder extends RecyclerView.ViewHolder {

    private ImageView mItemImage;
    private TextView mCountryName;

    public QuickCardViewHolder(View itemView) {
        super(itemView);

        mItemImage = (ImageView) itemView.findViewById(R.id.prince_photo);
        mCountryName = (TextView) itemView.findViewById(R.id.country_name);
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
