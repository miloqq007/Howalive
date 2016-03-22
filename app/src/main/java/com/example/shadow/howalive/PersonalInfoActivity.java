package com.example.shadow.howalive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by Shadow on 2016/3/15.
 */
public class PersonalInfoActivity extends Activity {

    LoadHeadIconButton Perinfo_headicon_btn;
    Text2ImageButton perinfo_neckname_btn;
    Text2ImageButton Perinfo_sex_btn;
    Text2ImageButton Perinfo_city_btn;
    Text2ImageButton Perinfo_bringyear_btn;
    Button ret_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.personal_info);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);

        ret_btn = (Button)findViewById(R.id.header_left_btn);
        ret_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Perinfo_headicon_btn = (LoadHeadIconButton)findViewById(R.id.perinfo_headiconbtn);
        Perinfo_headicon_btn.setImgResource(R.drawable.try1);

        perinfo_neckname_btn = (Text2ImageButton) findViewById(R.id.perinfo_necknamebtn);
        perinfo_neckname_btn.setText1("昵称");
        perinfo_neckname_btn.setText2("给我来个白皮点心");
        perinfo_neckname_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent modneckintent = new Intent();
                modneckintent.setClass(PersonalInfoActivity.this, ModifyNecknameActivity.class);
                PersonalInfoActivity.this.startActivity(modneckintent);
            }
        });

        Perinfo_sex_btn = (Text2ImageButton) findViewById(R.id.perinfo_sexbtn);
        Perinfo_sex_btn.setText1("性别");
        Perinfo_sex_btn.setText2("女");
        Perinfo_sex_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent modsexintent = new Intent();
                modsexintent.setClass(PersonalInfoActivity.this, ModifySexActivity.class);
                PersonalInfoActivity.this.startActivity(modsexintent);
            }
        });

        Perinfo_city_btn = (Text2ImageButton) findViewById(R.id.perinfo_citybtn);
        Perinfo_city_btn.setText1("城市");
        Perinfo_city_btn.setText2("上海");
        Perinfo_city_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent modcityintent = new Intent();
                modcityintent.setClass(PersonalInfoActivity.this, ModifyCityActivity.class);
                PersonalInfoActivity.this.startActivity(modcityintent);
            }
        });

        Perinfo_bringyear_btn =(Text2ImageButton)findViewById(R.id.perinfo_bringyearbtn);
        Perinfo_bringyear_btn.setText1("养殖年限");
        Perinfo_bringyear_btn.setText2("2016-1-27");
    }
}