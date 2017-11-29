package com.dogpo.variablefont;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by User on 11/29/2017.
 */

public class VariableTextView extends android.support.v7.widget.AppCompatTextView {
    UserSessionManager userSessionManager;

    public VariableTextView(Context context) {
        super(context);
        userSessionManager = new UserSessionManager(context);
        this.setTextSize(userSessionManager.getFontSize());
    }

    public VariableTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        userSessionManager = new UserSessionManager(context);
        this.setTextSize(userSessionManager.getFontSize());
    }

    public VariableTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        userSessionManager = new UserSessionManager(context);
        this.setTextSize(userSessionManager.getFontSize());
    }
}
