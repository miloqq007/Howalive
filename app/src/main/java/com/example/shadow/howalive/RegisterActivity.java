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

/**
 * Created by Shadow on 2016/3/8.
 */
public class RegisterActivity extends Activity{
    Button btn_ret;
    Button btn_nxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.register);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);
        init();
    }

    private void init()
    {
        btn_ret = (Button)findViewById(R.id.header_left_btn);
        btn_ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_nxt = (Button)findViewById(R.id.next_btr);
        btn_nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(RegisterActivity.this)
                        .setTitle("确定用户信息")
                        .setPositiveButton("确定",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        // TODO Auto-generated method stub
                                        Intent intent = new Intent(RegisterActivity.this, AboutAdminActivity.class);
                                        startActivity(intent);
                                    }
                                }).setNegativeButton("取消", null).create()
                        .show();
            }
        });
    }
}
