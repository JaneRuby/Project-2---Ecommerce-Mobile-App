package com.example.janerubygrissom.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by janerubygrissom on 7/26/16.
 */


public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "PrinceDB";
    public static final int DATABASE_VERSION = 1;
    public static final String PRINCE_TABLE = "Prince_Table";
    public static final String SHOPPING_TABLE = "Shopping_Table";
    public static final String COL_PRINCE_NAME = "Prince_Name";
    public static final String COL_PRINCE_ITEMDESC = "Prince_Item_Desc";
    public static final String COL_PRINCE_DESC = "Prince_Desc";
    public static final String COL_WEBSITE_IMAGE = "Prince_Image";
    public static final String COL_LIST_ID = "_id";

    public static final String TAG = "INSIDE DATABASEHELPER";

    private static DBHelper sInstance;


    private DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static DBHelper getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new DBHelper(context.getApplicationContext());
        }
        return sInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createString = "CREATE TABLE " + PRINCE_TABLE + "(" +
                COL_LIST_ID + " INTEGER PRIMARY KEY, " +
                COL_PRINCE_NAME + " TEXT, " +
                COL_PRINCE_DESC + " TEXT, " +
                COL_PRINCE_ITEMDESC + " TEXT, " +
                COL_WEBSITE_IMAGE + " TEXT)";
        sqLiteDatabase.execSQL(createString);

        createString = "CREATE TABLE " + SHOPPING_TABLE + "(" +
                COL_LIST_ID + " INTEGER PRIMARY KEY, " +
                COL_PRINCE_NAME + " TEXT, " +
                COL_PRINCE_DESC + " TEXT, " +
                COL_PRINCE_ITEMDESC + " TEXT, " +
                COL_WEBSITE_IMAGE + " TEXT)";
        sqLiteDatabase.execSQL(createString);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        String deleteTable = "DROP TABLE IF EXISTS " + PRINCE_TABLE;
        sqLiteDatabase.execSQL(deleteTable);

        deleteTable = "DROP TABLE IF EXISTS " + SHOPPING_TABLE;
        sqLiteDatabase.execSQL(deleteTable);

        onCreate(sqLiteDatabase);
    }

    //getlist


    public void insertMainInventory(InventoryItem mainObject) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COL_PRINCE_NAME, mainObject.getName());
        values.put(COL_PRINCE_DESC, mainObject.getDescription());
        values.put(COL_PRINCE_ITEMDESC, mainObject.getItemDescription());
        values.put(COL_WEBSITE_IMAGE, mainObject.getmWebsite());
        db.insertOrThrow(PRINCE_TABLE, null, values);
    }

    public void insertShoppingCart(InventoryItem mainObject) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COL_PRINCE_NAME, mainObject.getName());
        values.put(COL_PRINCE_DESC, mainObject.getDescription());
        values.put(COL_PRINCE_ITEMDESC, mainObject.getItemDescription());
        values.put(COL_WEBSITE_IMAGE, mainObject.getmWebsite());

        db.insertOrThrow(SHOPPING_TABLE, null, values);

        db.close();


    }

    //TODO method for retrieving all Prince products searched with a keyword/tag
    public Cursor getPrinceBySearch(String search) {
        SQLiteDatabase db = getReadableDatabase();

        Cursor cursor = db.query(PRINCE_TABLE,
                new String[]{COL_PRINCE_NAME, COL_PRINCE_DESC, COL_LIST_ID, COL_WEBSITE_IMAGE},
                COL_PRINCE_NAME + " Like ?",
                new String[]{"%" + search + "%"},
                null, null, null);
        return cursor;
    }

    //TODO method for retrieving Name description details
    public Cursor getPrinceBySearch2(String search) {
        InventoryItem prince = null;

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(
                PRINCE_TABLE,   //table name
                null,   //String[] projection (null for */all columns)
                COL_PRINCE_DESC + " = ? ",   //String selection with " = ? " or " LIKE ? "
                new String[]{String.valueOf(search)},//String[] selection
                null,   //String groupBy
                null,   //String having
                null    //String orderBy
        );

        return cursor;


    }

    //TODO method for retrieving item description details
    public ArrayList<InventoryItem> getPrinceBySearch3(String search) {
        ArrayList<InventoryItem> list = new ArrayList<>();
        InventoryItem prince = null;

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(
                PRINCE_TABLE,   //table name
                null,   //String[] projection (null for */all columns)
                COL_PRINCE_NAME + " like ? ",
                new String[]{"%" + search + "%"},//String[] selection
                null,   //String groupBy
                null,   //String having
                null    //String orderBy
        );

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            String name = (cursor.getString(cursor.getColumnIndex(COL_PRINCE_NAME)));
            String description = (cursor.getString(cursor.getColumnIndex(COL_PRINCE_DESC)));
            String itemDescription = (cursor.getString(cursor.getColumnIndex(COL_PRINCE_ITEMDESC)));
            String websiteImage = (cursor.getString(cursor.getColumnIndex(COL_WEBSITE_IMAGE)));


            list.add(new InventoryItem(name, description, itemDescription, websiteImage));

            cursor.moveToNext();
        }
        cursor.close();

        return list;


    }

//    getallfromtable and returns arraylist x2

    public ArrayList<String> getProductData() {
        ArrayList<String> arrayList = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        String query = "SELECT " + COL_PRINCE_NAME + "," + COL_PRINCE_DESC + "," + COL_PRINCE_ITEMDESC + "," + COL_WEBSITE_IMAGE + " FROM " + PRINCE_TABLE + " JOIN " + PRINCE_TABLE + " ON " +
                PRINCE_TABLE + "." + COL_LIST_ID + " = " + PRINCE_TABLE + "." + COL_LIST_ID;
        Cursor cursor = db.rawQuery(query, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            arrayList.add(cursor.getString(cursor.getColumnIndex(COL_PRINCE_NAME)));
            arrayList.add(cursor.getString(cursor.getColumnIndex(COL_PRINCE_DESC)));
            arrayList.add(cursor.getString(cursor.getColumnIndex(COL_PRINCE_ITEMDESC)));
            arrayList.add(cursor.getString(cursor.getColumnIndex(COL_WEBSITE_IMAGE)));
            cursor.moveToNext();
        }
        cursor.close();
        return arrayList;
    }

    public ArrayList<InventoryItem> getShoppingData() {
        ArrayList<InventoryItem> arrayList = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();

        //something
        String query = "SELECT " + COL_PRINCE_NAME + "," + COL_PRINCE_DESC + "," + COL_PRINCE_ITEMDESC + "," + COL_WEBSITE_IMAGE + " FROM " + SHOPPING_TABLE;
        //endsomething

        Cursor cursor = db.rawQuery(query, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            String name = (cursor.getString(cursor.getColumnIndex(COL_PRINCE_NAME)));
            String description = (cursor.getString(cursor.getColumnIndex(COL_PRINCE_DESC)));
            String itemDescription = (cursor.getString(cursor.getColumnIndex(COL_PRINCE_ITEMDESC)));
            String websiteImage = (cursor.getString(cursor.getColumnIndex(COL_WEBSITE_IMAGE)));


            arrayList.add(new InventoryItem(name, description, itemDescription, websiteImage));

            cursor.moveToNext();
        }
        cursor.close();
        return arrayList;
    }

    public void deleteShoppingCart() {
        SQLiteDatabase db = getWritableDatabase();

        db.execSQL("delete from " + SHOPPING_TABLE);
        db.close();
    }
}

