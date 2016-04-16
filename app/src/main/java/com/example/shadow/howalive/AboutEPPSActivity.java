package com.example.shadow.howalive;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 张丽娟 on 2016/3/16.
 */
public class AboutEPPSActivity extends Activity {

    Button ret_btn;
    TextView titlebar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.aboutepps);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);

        titlebar = (TextView) findViewById(R.id.header_text);
        titlebar.setText("关于EPPS");
        ret_btn = (Button) findViewById(R.id.header_left_btn);
        ret_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
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
