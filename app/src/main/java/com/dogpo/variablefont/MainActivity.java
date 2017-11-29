package com.dogpo.variablefont;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    SeekBar sbFont;
    UserSessionManager userSessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userSessionManager = new UserSessionManager(this);
        initViews();
    }

    private void initViews() {
        sbFont = (SeekBar) findViewById(R.id.sb_font);
        int size= (int) (userSessionManager.getFontSize()-24);
        sbFont.setProgress(size);

        sbFont.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                userSessionManager.setFontSize(i + 24);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
