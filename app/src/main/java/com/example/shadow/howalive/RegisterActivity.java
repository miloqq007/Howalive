package com.example.shadow.howalive;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Shadow on 2016/3/8.
 */
public class RegisterActivity extends Activity{
    Button btn_ret;
    Button btn_nxt;
    TextView UserName;
    TextView Password1;
    TextView Password2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.register);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);
        MyApp.getInstance().addActivity(this);
        init();
    }

    private void init()
    {
        UserName = (TextView)findViewById(R.id.tx_user);
        Password1 = (TextView)findViewById(R.id.tx_pas);
        Password2 = (TextView)findViewById(R.id.tx_pas2);
        btn_nxt = (Button)findViewById(R.id.next_btr);
        btn_ret = (Button)findViewById(R.id.header_left_btn);
        UserName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(UserName.getText().toString()!=null && !UserName.getText().toString().equals("") &&
                        Password1.getText().toString()!=null && !Password1.getText().toString().equals("")&&
                        Password2.getText().toString()!=null && !Password2.getText().toString().equals("")) {
                    btn_nxt.setEnabled(true);
                    btn_nxt.setBackgroundResource(R.drawable.cir_button2);
                } else {
                    btn_nxt.setEnabled(false);
                    btn_nxt.setGravity(Gravity.CENTER);
                    btn_nxt.setBackgroundResource(R.drawable.cir_btr);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if(UserName.getText().toString()!=null && !UserName.getText().toString().equals("") &&
                        Password1.getText().toString()!=null && !Password1.getText().toString().equals("")&&
                        Password2.getText().toString()!=null && !Password2.getText().toString().equals("")) {
                    btn_nxt.setEnabled(true);
                    btn_nxt.setBackgroundResource(R.drawable.cir_button2);
                } else {
                    btn_nxt.setEnabled(false);
                    btn_nxt.setGravity(Gravity.CENTER);
                    btn_nxt.setBackgroundResource(R.drawable.cir_btr);
                }
            }
        });
        Password1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(UserName.getText().toString()!=null && !UserName.getText().toString().equals("") &&
                        Password1.getText().toString()!=null && !Password1.getText().toString().equals("")&&
                        Password2.getText().toString()!=null && !Password2.getText().toString().equals("")) {
                    btn_nxt.setEnabled(true);
                    btn_nxt.setBackgroundResource(R.drawable.cir_button2);
                } else {
                    btn_nxt.setEnabled(false);
                    btn_nxt.setGravity(Gravity.CENTER);
                    btn_nxt.setBackgroundResource(R.drawable.cir_btr);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if(UserName.getText().toString()!=null && !UserName.getText().toString().equals("") &&
                        Password1.getText().toString()!=null && !Password1.getText().toString().equals("")&&
                        Password2.getText().toString()!=null && !Password2.getText().toString().equals("")) {
                    btn_nxt.setEnabled(true);
                    btn_nxt.setBackgroundResource(R.drawable.cir_button2);
                } else {
                    btn_nxt.setEnabled(false);
                    btn_nxt.setGravity(Gravity.CENTER);
                    btn_nxt.setBackgroundResource(R.drawable.cir_btr);
                }
            }
        });
        Password2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(UserName.getText().toString()!=null && !UserName.getText().toString().equals("") &&
                        Password1.getText().toString()!=null && !Password1.getText().toString().equals("")&&
                        Password2.getText().toString()!=null && !Password2.getText().toString().equals("")) {
                    btn_nxt.setEnabled(true);
                    btn_nxt.setBackgroundResource(R.drawable.cir_button2);
                } else {
                    btn_nxt.setEnabled(false);
                    btn_nxt.setGravity(Gravity.CENTER);
                    btn_nxt.setBackgroundResource(R.drawable.cir_btr);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if(UserName.getText().toString()!=null && !UserName.getText().toString().equals("") &&
                        Password1.getText().toString()!=null && !Password1.getText().toString().equals("")&&
                        Password2.getText().toString()!=null && !Password2.getText().toString().equals("")) {
                    btn_nxt.setEnabled(true);
                    btn_nxt.setBackgroundResource(R.drawable.cir_button2);
                } else {
                    btn_nxt.setEnabled(false);
                    btn_nxt.setGravity(Gravity.CENTER);
                    btn_nxt.setBackgroundResource(R.drawable.cir_btr);
                }
            }
        });
        btn_ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Password1.getText().toString().equals(Password2.getText().toString())) {
                    new AlertDialog.Builder(RegisterActivity.this)
                            .setTitle("确定用户信息")
                            .setPositiveButton("确定",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog,
                                                            int which) {
                                            // TODO Auto-generated method stub
                                            String SQL = "";
                                            Intent intent = new Intent(RegisterActivity.this, AboutAdminActivity.class);
                                            startActivity(intent);
                                        }
                                    }).setNegativeButton("取消", null).create()
                            .show();
                } else {
                    new AlertDialog.Builder(RegisterActivity.this)
                            .setTitle("两次密码不匹配")
                            .setPositiveButton("确定",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog,
                                                            int which) {
                                            // TODO Auto-generated method stub
                                        }
                                    }).setNegativeButton("取消", null).create()
                            .show();
                }
            }
        });
    }
}
