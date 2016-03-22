package com.example.shadow.howalive;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 张丽娟 on 2016/3/15.
 */
public class WaterDetialActivity extends Activity {

    Button ret_btn;
    TextView titlebar;

    HumidometerLay myhumidometer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.water_detial);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);

        titlebar = (TextView)findViewById(R.id.header_text);
        titlebar.setText("浇水详情");
        ret_btn = (Button)findViewById(R.id.header_left_btn);
        ret_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        myhumidometer = (HumidometerLay)findViewById(R.id.myhumidometer);
        myhumidometer.setScale1Invisable(false);
        myhumidometer.setScale2Invisable(false);
        myhumidometer.setScale3Invisable(false);
        myhumidometer.setScale4Invisable(false);
    }
}
