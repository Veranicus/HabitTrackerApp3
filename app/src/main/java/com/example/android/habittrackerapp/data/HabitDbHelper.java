package com.example.android.habittrackerapp.data;

        import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

        import com.example.android.habittrackerapp.data.HabitContract.HabitEntry;

/**
 * Created by Polacek on 21.7.2017.
 */

public class HabitDbHelper extends SQLiteOpenHelper {

    // If you change the database schema, you must increment the database version.//
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "habit.db";

    //Constructor HabitDbHelper
    public HabitDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //Creating table
    @Override
    public void onCreate(SQLiteDatabase db) {
        //Creating table that will store information about each of the user's habits //
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + HabitEntry.TABLE_NAME + " (" +
                HabitEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                HabitEntry.COLUMN_HABIT_NAME + " TEXT," +
                HabitEntry.COLUMN_HABIT_LENGTH + "INTEGER NOT  NULL);";
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // The database is still at version 1, so there's nothing to do be done here.
    }
}



