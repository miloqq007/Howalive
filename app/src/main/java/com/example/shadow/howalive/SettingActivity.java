package com.example.shadow.howalive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 张丽娟 on 2016/3/16.
 */
public class SettingActivity extends Activity {

    Button ret_btn;
    TextView titlebar;

    Text2ImageButton personal_info_btn;
    Text2ImageButton modify_password_btn;
    Text2ImageButton aboutEPPS;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.setting);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);

        titlebar = (TextView) findViewById(R.id.header_text);
        titlebar.setText("设置");
        ret_btn = (Button) findViewById(R.id.header_left_btn);
        ret_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        personal_info_btn = (Text2ImageButton)findViewById(R.id.setting_personalinfo_btn);
        personal_info_btn.setText1("个人资料");
        personal_info_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent personalinfointent = new Intent();
                personalinfointent.setClass(SettingActivity.this, PersonalInfoActivity.class);
                SettingActivity.this.startActivity(personalinfointent);
            }
        });

        modify_password_btn = (Text2ImageButton)findViewById(R.id.setting_modifypassword_btn);
        modify_password_btn.setText1("修改密码");
        modify_password_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent modifypswintent = new Intent();
                modifypswintent.setClass(SettingActivity.this, ModifyPasswardActivity.class);
                SettingActivity.this.startActivity(modifypswintent);
            }
        });

        aboutEPPS = (Text2ImageButton)findViewById(R.id.setting_aboutEPPS_btn);
        aboutEPPS.setText1("关于EPPS");
        aboutEPPS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abouteppsintent = new Intent();
                abouteppsintent.setClass(SettingActivity.this,AboutEPPSActivity.class);
                SettingActivity.this.startActivity(abouteppsintent);
            }
        });
    }
}
