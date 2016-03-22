package com.example.shadow.howalive;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Shadow on 2016/3/18.
 */
public class ModifySexActivity extends Activity {
    TextView titlebar;
    Button ret_btn;
    Text2ImageButton modi_sex_man_btn;
    Text2ImageButton getModi_sex_woman_btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.modify_sex);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);
        titlebar = (TextView)findViewById(R.id.header_text);
        titlebar.setText("性别");
        ret_btn = (Button)findViewById(R.id.header_left_btn);
        ret_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        modi_sex_man_btn = (Text2ImageButton)findViewById(R.id.modifysex_man_btn);
        modi_sex_man_btn.setText1("男");
        modi_sex_man_btn.setKey(false);

        getModi_sex_woman_btn = (Text2ImageButton)findViewById(R.id.modifysex_woman_btn);
        getModi_sex_woman_btn.setText1("女");
        getModi_sex_woman_btn.setKey(true);
    }
}
