package com.example.shadow.howalive;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Shadow on 2016/3/10.
 */
public class AboutAdminActivity extends Activity {
    TextView header_text;
    Button btn_ret;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.about_admin);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);
        init();
    }

    private void init()
    {
        header_text = (TextView)findViewById(R.id.header_text);
        header_text.setText("主人资料   ");
        btn_ret = (Button)findViewById(R.id.header_left_btn);
        btn_ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
