package com.example.shadow.howalive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by 张丽娟 on 2016/3/21.
 */
public class HomePlantDetialActivity extends Activity {

    Button left_ret;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.home_plant_detial);

        left_ret = (Button)findViewById(R.id.homeplantdetial_left_btn);
        left_ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}

