package com.example.janerubygrissom.project2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by janerubygrissom on 7/26/16.
 */


public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "PrinceDB";
    public static final int DATABASE_VERSION = 1;
    public static final String PRINCE_TABLE = "Prince_Table";
    public static final String SHOPPING_TABLE = "Shopping_Table";
    public static final String COL_PRINCE_NAME = "Prince_Name";
    public static final String COL_PRINCE_DESC = "Prince_Desc";
    public static final String COL_WEBSITE_IMAGE = "Prince_Image";
    public static final String COL_LIST_ID = "_id";


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
                COL_PRINCE_DESC + " TEXT " +
                COL_WEBSITE_IMAGE + " TEXT)";
        sqLiteDatabase.execSQL(createString);

        createString = "CREATE TABLE " + SHOPPING_TABLE + "(" +
                COL_LIST_ID + " INTEGER PRIMARY KEY, " +
                COL_PRINCE_NAME + " TEXT, " +
                COL_PRINCE_DESC + " TEXT " +
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


    public void insertMainInventory(InventoryItem mainObject){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COL_PRINCE_NAME, mainObject.getName());
        values.put(COL_PRINCE_DESC, mainObject.getDescription());
        db.insertOrThrow(PRINCE_TABLE, null, values);
    }
    public void insertShoppingCart(InventoryItem mainObject){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COL_PRINCE_NAME, mainObject.getName());
        values.put(COL_PRINCE_DESC, mainObject.getDescription());
        db.insertOrThrow(SHOPPING_TABLE, null, values);
    }

}
