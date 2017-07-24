package com.example.android.habittrackerapp.data;

        import android.provider.BaseColumns;

/**
 * Created by Polacek on 21.7.2017.
 */

public class HabitContract {

    private HabitContract() {
    }

    //Habit entry defining each of the collumns
    public static final class HabitEntry implements BaseColumns {
        public final static String TABLE_NAME = "habits";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_HABIT_NAME = "name";
        public final static String COLUMN_HABIT_LENGTH = "length";
        private static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + HabitEntry.TABLE_NAME;
    }
}



