package com.example.janerubygrissom.myapplication;

/**
 * Created by janerubygrissom on 7/26/16.
 */
public class InventoryItem {

    private String mName, mDescription,mItemDescription, mWebsite;


//    public InventoryItem(String s, String s1, String s2, String s3) {
//    }

    public InventoryItem(String name, String description, String itemDescription, String website) {
        mName = name;
        mDescription = description;
        mWebsite = website;
        mItemDescription = itemDescription;
    }

//    public InventoryItem(String mName, String mDescription, String mitemDescription, String mWebsite) {
//        this.mName = mName;
//        this.mDescription = mDescription;
//        this.mWebsite = mWebsite;
//        this.mItemDescription = mitemDescription;
//    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public String getItemDescription() { return mDescription; }

    public void setItemDescription(String itemDescription) {this.mItemDescription = itemDescription; }

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
