package com.example.shadow.howalive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 张丽娟 on 2016/3/14.
 */
public class WaterSelectPlantActivity extends Activity {

    Button ret_btn;
    TextView titlebar;

    PlantListButton plant1_list_btn;
    PlantListButton plant2_list_btn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.water_selectplant);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);

        titlebar = (TextView)findViewById(R.id.header_text);
        titlebar.setText("浇水");
        ret_btn = (Button)findViewById(R.id.header_left_btn);
        ret_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        plant1_list_btn = (PlantListButton)findViewById(R.id.plant1_list);
        plant1_list_btn.setTextName("小米粥");
        plant1_list_btn.setTextKind("水仙");
        plant1_list_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent waterdetialintent = new Intent();
                waterdetialintent.setClass(WaterSelectPlantActivity.this, WaterDetialActivity.class);
                WaterSelectPlantActivity.this.startActivity(waterdetialintent);
            }
        });

        plant2_list_btn = (PlantListButton)findViewById(R.id.plant2_list);
        plant2_list_btn.setImgResource(R.drawable.plant_head2);
        plant2_list_btn.setTextName("小馒头");
        plant2_list_btn.setTextKind("仙人掌");
    }
}
