package com.example.shadow.howalive;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Shadow on 2016/3/14.
 */
public class PasswordActivity extends Activity {

    Button btn_ret;
    Button btn_forget;
    Button btn_log;
    EditText et_user;
    EditText et_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_password);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);
        MyApp.getInstance().addActivity(this);
        init();
    }

    private void init()
    {
        et_user = (EditText)findViewById(R.id.pass_tx_user);
        et_password = (EditText)findViewById(R.id.pass_tx_pas);
        btn_ret = (Button)findViewById(R.id.header_left_btn);
        btn_ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_forget = (Button)findViewById(R.id.pass_forget);
        btn_forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(PasswordActivity.this)
                        .setTitle("请与后台开发人员联系" +
                                "：miloqq007@foxmail.com")
                        .setPositiveButton("确定", null).create()
                        .show();
            }
        });
        btn_log = (Button)findViewById(R.id.pass_log);
        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = et_user.getText().toString();
                MyApp.getInstance().setUser(user);
                Intent intent = new Intent(PasswordActivity.this, MainActivity.class);
                startActivity(intent);
                MyApp.getInstance().exit();
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
