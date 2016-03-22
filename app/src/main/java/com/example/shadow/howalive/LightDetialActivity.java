package com.example.shadow.howalive;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 张丽娟 on 2016/3/16.
 */
public class LightDetialActivity extends Activity {

    Button ret_btn;
    TextView titlebar;

    PhotometerLay myphotometer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.light_detial);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);

        titlebar = (TextView) findViewById(R.id.header_text);
        titlebar.setText("调光详情");
        ret_btn = (Button) findViewById(R.id.header_left_btn);
        ret_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        myphotometer = (PhotometerLay)findViewById(R.id.myphotometer);
        myphotometer.setScale1Invisable(false);
        myphotometer.setScale2Invisable(false);
        myphotometer.setScale3Invisable(false);
        myphotometer.setScale4Invisable(false);
    }
}
