package com.example.myapplicationandriod3.data.local;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceUtils {

    private static SharedPreferences mPreferences;
    private final static String APP_PREF_NAME = "kg.geekthech:.lesson 1";
    private final static String USER_NAME = "kg.geekthech:.lesson 1.username";
    private final static String USER_PASS = "kg.geekthech.lesson 1.userpass";

   public static void init(Context context){
        mPreferences = context.getSharedPreferences(APP_PREF_NAME,Context.MODE_PRIVATE);


    }
   public static void  saveUserName(String userName){
        mPreferences.edit().putString(USER_NAME,userName).apply();

    }
   public static String getUserName(){
       return mPreferences.getString(USER_NAME,"");


    }
    public static void  saveUserPass(String userPass){
       mPreferences.edit().putString(USER_PASS,userPass).apply();
    }

    public static String gerUserPass(){
       return mPreferences.getString(USER_PASS,"");
    }

    public static void onDelete(){
       SharedPreferences.Editor editor = mPreferences.edit();
       editor.clear();
       editor.apply();
    }


}
