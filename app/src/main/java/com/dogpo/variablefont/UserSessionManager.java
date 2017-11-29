package com.dogpo.variablefont;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class UserSessionManager {

    // Sharedpref file name
    private static final String PREFER_NAME = "AndroidExamplePref";
    private static final String FONTSIZE = "fontsize";
    // Shared Preferences reference
    SharedPreferences pref;
    // Editor reference for Shared preferences
    Editor editor;
    // Context
    Context _context;
    // Shared pref mode
    int PRIVATE_MODE = 0;


    // Constructor
    public UserSessionManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREFER_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public float getFontSize() {
        return pref.getFloat(FONTSIZE, 24);
    }

    public void setFontSize(float fontSize) {
        editor.putFloat(FONTSIZE, fontSize);
        editor.commit();
    }



}
