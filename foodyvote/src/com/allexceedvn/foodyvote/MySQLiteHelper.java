package com.allexceedvn.foodyvote;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLiteHelper extends SQLiteOpenHelper {
	

	public static final String DATABASE_NAME = "SongDB";
	public static final String TABLE_NAME = "song";

	public static final String COL_ID = "_id";
	public static final String COL_SONGNAME = "song_name";
	public static final String COL_SONGNAME2 = "song_name2";
	public static final String COL_LYRIC = "song_lyric";

    public static final String TABLE_NAME_CITY = "city";
    public static final String COL_CITY_ID = "city_cd";
    public static final String COL_CITY_NAME = "city_name";

    public static final String TABLE_NAME_DISTRICT = "district";
    public static final String COL_DISTRICT_CITY_ID = "city_cd";
    public static final String COL_DISTRICT_ID = "district_cd";
    public static final String COL_DISTRICT_NAME = "district_name";

	public MySQLiteHelper(Context context) {
		super(context, DATABASE_NAME, null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {

    }

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}