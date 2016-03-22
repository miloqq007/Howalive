package com.example.shadow.howalive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 张丽娟 on 2016/3/17.
 */
public class EditPlantInfoActivity extends Activity {

    TextView titlebar;
    Button ret_btn;

    LoadHeadIconButton plantinfo_headicon_btn;
    Text2ImageButton plantinfo_name_btn;
    Text2ImageButton plantinfo_kind_btn;
    Text2ImageButton plantinfo_arrivetime_btn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.edit_plant_info);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);
        titlebar = (TextView)findViewById(R.id.header_text);
        titlebar.setText("编辑资料");
        ret_btn = (Button)findViewById(R.id.header_left_btn);
        ret_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        plantinfo_headicon_btn = (LoadHeadIconButton)findViewById(R.id.plantinfo_headiconbtn);
        plantinfo_headicon_btn.setImgResource(R.drawable.plant_head1);
        plantinfo_headicon_btn.setText("修改头像");

        plantinfo_name_btn = (Text2ImageButton) findViewById(R.id.plantinfo_plantnamebtn);
        plantinfo_name_btn.setText1("植物名字");
        plantinfo_name_btn.setText2("小米粥");
        plantinfo_name_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent modplnameintent = new Intent();
                modplnameintent.setClass(EditPlantInfoActivity.this, ModifyPlantNameActivity.class);
                EditPlantInfoActivity.this.startActivity(modplnameintent);
            }
        });

        plantinfo_kind_btn = (Text2ImageButton) findViewById(R.id.plantinfo_plantkindbtn);
        plantinfo_kind_btn.setText1("植物品种");
        plantinfo_kind_btn.setText2("水仙");
        plantinfo_kind_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kindintent = new Intent();
                kindintent.setClass(EditPlantInfoActivity.this, HotKindActivity.class);
                EditPlantInfoActivity.this.startActivity(kindintent);
            }
        });

        plantinfo_arrivetime_btn = (Text2ImageButton) findViewById(R.id.plantinfo_arrivetimebtn);
        plantinfo_arrivetime_btn.setText1("到家时间");
        plantinfo_arrivetime_btn.setText2("2016-1-27");
    }
}
