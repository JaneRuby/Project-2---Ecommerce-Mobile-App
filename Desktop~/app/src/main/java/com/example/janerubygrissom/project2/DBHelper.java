package com.example.janerubygrissom.project2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
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


    public void insertMainInventory(InventoryItem mainObject) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COL_PRINCE_NAME, mainObject.getName());
        values.put(COL_PRINCE_DESC, mainObject.getDescription());
        values.put(COL_WEBSITE_IMAGE, mainObject.getmWebsite());
        db.insertOrThrow(PRINCE_TABLE, null, values);
    }

    public void insertShoppingCart(InventoryItem mainObject) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COL_PRINCE_NAME, mainObject.getName());
        values.put(COL_PRINCE_DESC, mainObject.getDescription());
        values.put(COL_WEBSITE_IMAGE, mainObject.getmWebsite());
        db.insertOrThrow(SHOPPING_TABLE, null, values);


    }

    //TODO method for retrieving all Prince products searched with a keyword/tag
    public Cursor getPrinceBySearch(String search) {
        SQLiteDatabase db = getReadableDatabase();

        Cursor cursor = db.query(PRINCE_TABLE,
                new String[]{COL_PRINCE_NAME, COL_PRINCE_DESC, COL_LIST_ID, COL_WEBSITE_IMAGE},
                COL_PRINCE_NAME + " =?",
                new String[]{"PRINCE"},
                null, null, null);
        cursor.moveToFirst();
        return cursor;
    }

    //TODO method for retrieving details/object
    public Cursor getItemById(long id) {
        InventoryItem prince = null;

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(
                PRINCE_TABLE,   //table name
                null,   //String[] projection (null for */all columns)
                COL_LIST_ID + " = ? ",   //String selection with " = ? " or " LIKE ? "
                new String[]{String.valueOf(id)},   //String[] selection
                null,   //String groupBy
                null,   //String having
                null    //String orderBy
        );

//        if (cursor.moveToFirst()) {
//            Log.i(TAG, "Creating then returning Prince object");
//            InventoryItem = new InventoryItem(
//                    cursor.getInt(cursor.getColumnIndex(COL_LIST_ID)),
//                    cursor.getString(cursor.getColumnIndex(COL_PRINCE_NAME)),
//                    cursor.getString(cursor.getColumnIndex(COL_PRINCE_DESC));
//        });
//        }
//
//        return InventoryItem;
return cursor;

    }
}
//
//    //TODO method for updating quantity of an item already in the list
//    public void changeQuantity(long foodId, long userId, int quantity) {
//        SQLiteDatabase db = getWritableDatabase();
//
//        ContentValues values = new ContentValues();
//        values.put(COL_QUANTITY_ITEM, quantity);
//
//        int i = db.update(
//                ITEM_TABLE_NAME,
//                values,
//                COL____________ + " = ? AND " +
//                        COL_________ + " = ? AND " +
//                        COL__________ + " = ",
//                new String[]{String.valueOf(foodId),
//                        String.valueOf(userId),
//                        String.valueOf(0)}
//        );
//
//        if (i != -1) {
//            Log.i(TAG, "Item quantity update successful");
//        }
//
//        db.close();
//
//    }



/**
 * Cursor cursor = db.query(
 * null,   //table name
 * null,   //String[] projection
 * null,   //String selection with " = ? " or " LIKE ? "
 * null,   //String[] selection
 * null,   //String groupBy
 * null,   //String having
 * null    //String orderBy
 * );
 */

