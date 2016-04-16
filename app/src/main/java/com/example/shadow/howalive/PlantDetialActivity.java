package com.example.shadow.howalive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 张丽娟 on 2016/3/16.
 */
public class PlantDetialActivity extends Activity {

    Button ret_btn;
    Button editinfo;

    DateTimeWidget time1;
    DateTimeWidget time2;
    DateTimeWidget time3;
    DateTimeWidget time4;
    DateTimeWidget time5;

    RecordListWidget record1;
    RecordListWidget record2;
    RecordListWidget record3;
    RecordListWidget record4;
    RecordListWidget record5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.plant_detial);

        ret_btn = (Button)findViewById(R.id.plantdetial_left_btn);
        ret_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        editinfo = (Button)findViewById(R.id.plant_detial_editinfo_btn);
        editinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editinfointent = new Intent();
                editinfointent.setClass(PlantDetialActivity.this, EditPlantInfoActivity.class);
                PlantDetialActivity.this.startActivity(editinfointent);
            }
        });

        time1 = (DateTimeWidget)findViewById(R.id.time1);
        time1.setTextDate("2016/1/27");
        time2 = (DateTimeWidget)findViewById(R.id.time2);
        time2.setTextDate("2016/2/1");
        time2.setTextTime("8:13");
        time3 = (DateTimeWidget)findViewById(R.id.time3);
        time3.setTextDate("2016/2/10");
        time3.setTextTime("14:06");
        time4 = (DateTimeWidget)findViewById(R.id.time4);
        time4.setTextDate("2016/2/19");
        time4.setTextTime("10:48");
        time5 = (DateTimeWidget)findViewById(R.id.time5);
        time5.setTextDate("2016/2/20");
        time5.setTextTime("19:17");

        record1 = (RecordListWidget)findViewById(R.id.record1);
        record1.setIcon(1);
        record1.setTxt(1);
        record2 = (RecordListWidget)findViewById(R.id.record2);
        record2.setIcon(2);
        record2.setTxt(2);
        record3 = (RecordListWidget)findViewById(R.id.record3);
        record3.setIcon(3);
        record3.setTxt(3);
        record4 = (RecordListWidget)findViewById(R.id.record4);
        record4.setIcon(4);
        record4.setTxt(4);
        record5 = (RecordListWidget)findViewById(R.id.record5);
        record5.setIcon(4);
        record5.setTxt(5);

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            //这里写你要在用户按下返回键同时执行的动作
            moveTaskToBack(false);            //核心代码：屏蔽返回行为
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
