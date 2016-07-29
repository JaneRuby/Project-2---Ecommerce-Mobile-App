package com.example.janerubygrissom.project2;

/**
 * Created by janerubygrissom on 7/26/16.
 */
public class InventoryItem {

    private String mName, mDescription, mWebsite;
    private int mImageResId;


    public InventoryItem(String s, String s1, String s2, int i, int bad_boy_prince) {
    }

    public InventoryItem(String name, String description, String category, String website) {
        mName = name;
        mDescription = description;
        mWebsite = website;
    }

    public InventoryItem(String mName, String mDescription, String mWebsite) {
        this.mName = mName;
        this.mDescription = mDescription;
        this.mWebsite = mWebsite;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getmWebsite() {
        return mWebsite;
    }

    public void setmWebsite(String mWebsite) {
        this.mWebsite = mWebsite;
    }
}
