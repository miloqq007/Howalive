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
 * Created by Shadow on 2016/3/18.
 */
public class ModifyCityActivity extends Activity {

    TextView titlebar;
    Button ret_btn;
    Text2ImageButton modicity_shanghai_btn;
    Text2ImageButton modicity_beijing_btn;
    Text2ImageButton modicity_tianjin_btn;
    Text2ImageButton modicity_chongqing_btn;
    Text2ImageButton modicity_hebei_btn;
    Text2ImageButton modicity_shan1xi_btn;
    Text2ImageButton modicity_neimenggu_btn;
    Text2ImageButton modicity_liaoning_btn;
    Text2ImageButton modicity_jilin_btn;
    Text2ImageButton modicity_heilongjiang_btn;
    Text2ImageButton modicity_jiangsu_btn;
    Text2ImageButton modicity_zhejiang_btn;
    Text2ImageButton modicity_anhui_btn;
    Text2ImageButton modicity_fujian_btn;
    Text2ImageButton modicity_jiangxi_btn;
    Text2ImageButton modicity_shandong_btn;
    Text2ImageButton modicity_henan_btn;
    Text2ImageButton modicity_hubei_btn;
    Text2ImageButton modicity_hunan_btn;
    Text2ImageButton modicity_guangdong_btn;
    Text2ImageButton modicity_guangxi_btn;
    Text2ImageButton modicity_hainan_btn;
    Text2ImageButton modicity_sichuan_btn;
    Text2ImageButton modicity_guizhou_btn;
    Text2ImageButton modicity_yunnan_btn;
    Text2ImageButton modicity_xizang_btn;
    Text2ImageButton modicity_shan3xi_btn;
    Text2ImageButton modicity_gansu_btn;
    Text2ImageButton modicity_qinghai_btn;
    Text2ImageButton modicity_ningxia_btn;
    Text2ImageButton modicity_xinjiang_btn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.modify_city);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);
        init();
    }

    private void init()
    {
        titlebar = (TextView)findViewById(R.id.header_text);
        ret_btn = (Button)findViewById(R.id.header_left_btn);
        modicity_shanghai_btn = (Text2ImageButton)findViewById(R.id.modifycity_shanghia_btn);
        modicity_beijing_btn = (Text2ImageButton)findViewById(R.id.modifycity_beijing_btn);
        modicity_tianjin_btn = (Text2ImageButton)findViewById(R.id.modifycity_tianjin_btn);
        modicity_chongqing_btn = (Text2ImageButton)findViewById(R.id.modifycity_chongqing_btn);
        modicity_hebei_btn = (Text2ImageButton)findViewById(R.id.modifycity_hebei_btn);
        modicity_shan1xi_btn = (Text2ImageButton) findViewById(R.id.modifycity_shan1xi_btn);
        modicity_neimenggu_btn = (Text2ImageButton) findViewById(R.id.modifycity_neimenggu_btn);
        modicity_liaoning_btn = (Text2ImageButton)findViewById(R.id.modifycity_liaoning_btn);
        modicity_jilin_btn = (Text2ImageButton)findViewById(R.id.modifycity_jilin_btn);
        modicity_heilongjiang_btn = (Text2ImageButton)findViewById(R.id.modifycity_heilongjiang_btn);
        modicity_jiangsu_btn = (Text2ImageButton)findViewById(R.id.modifycity_jiangsu_btn);
        modicity_zhejiang_btn = (Text2ImageButton)findViewById(R.id.modifycity_zhejiang_btn);
        modicity_anhui_btn = (Text2ImageButton)findViewById(R.id.modifycity_anhui_btn);
        modicity_fujian_btn = (Text2ImageButton)findViewById(R.id.modifycity_fujian_btn);
        modicity_jiangxi_btn = (Text2ImageButton)findViewById(R.id.modifycity_jiangxi_btn);
        modicity_shandong_btn = (Text2ImageButton)findViewById(R.id.modifycity_shandong_btn);
        modicity_henan_btn = (Text2ImageButton)findViewById(R.id.modifycity_henan_btn);
        modicity_hubei_btn = (Text2ImageButton)findViewById(R.id.modifycity_hubei_btn);
        modicity_hunan_btn = (Text2ImageButton)findViewById(R.id.modifycity_hunan_btn);
        modicity_guangdong_btn = (Text2ImageButton)findViewById(R.id.modifycity_guangdong_btn);
        modicity_guangxi_btn = (Text2ImageButton)findViewById(R.id.modifycity_guangxi_btn);
        modicity_hainan_btn = (Text2ImageButton)findViewById(R.id.modifycity_hainan_btn);
        modicity_sichuan_btn = (Text2ImageButton)findViewById(R.id.modifycity_sichuan_btn);
        modicity_guizhou_btn = (Text2ImageButton)findViewById(R.id.modifycity_guizhou_btn);
        modicity_yunnan_btn = (Text2ImageButton)findViewById(R.id.modifycity_yunnan_btn);
        modicity_xizang_btn = (Text2ImageButton)findViewById(R.id.modifycity_xizang_btn);
        modicity_shan3xi_btn = (Text2ImageButton)findViewById(R.id.modifycity_shan3xi_btn);
        modicity_gansu_btn = (Text2ImageButton)findViewById(R.id.modifycity_gansu_btn);
        modicity_qinghai_btn = (Text2ImageButton)findViewById(R.id.modifycity_qinghai_btn);
        modicity_ningxia_btn = (Text2ImageButton)findViewById(R.id.modifycity_ningxia_btn);
        modicity_xinjiang_btn = (Text2ImageButton)findViewById(R.id.modifycity_xinjiang_btn);

        ret_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "上海");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
        titlebar.setText("修改城市");

        modicity_shanghai_btn.setText1("上海");
        modicity_shanghai_btn.setKey(true);
        modicity_shanghai_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_shanghai_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "上海");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_beijing_btn.setText1("北京");
        modicity_beijing_btn.setKey(false);
        modicity_beijing_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_beijing_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "北京");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_tianjin_btn.setText1("天津");
        modicity_tianjin_btn.setKey(false);
        modicity_tianjin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_tianjin_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "天津");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_chongqing_btn.setText1("重庆");
        modicity_chongqing_btn.setKey(false);
        modicity_chongqing_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_tianjin_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "天津");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_hebei_btn.setText1("河北");
        modicity_hebei_btn.setKey(false);
        modicity_hebei_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_hebei_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "河北");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_shan1xi_btn.setText1("山西");
        modicity_shan1xi_btn.setKey(false);
        modicity_shan1xi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_shan1xi_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "山西");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_neimenggu_btn.setText1("内蒙古");
        modicity_neimenggu_btn.setKey(false);
        modicity_neimenggu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_neimenggu_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "内蒙古");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_liaoning_btn.setText1("辽宁");
        modicity_liaoning_btn.setKey(false);
        modicity_liaoning_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_liaoning_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "辽宁");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_jilin_btn.setText1("吉林");
        modicity_jilin_btn.setKey(false);
        modicity_jilin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_jilin_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "吉林");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_heilongjiang_btn.setText1("黑龙江");
        modicity_heilongjiang_btn.setKey(false);
        modicity_heilongjiang_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_heilongjiang_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "黑龙江");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_jiangsu_btn.setText1("江苏");
        modicity_jiangsu_btn.setKey(false);
        modicity_jiangsu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_jiangsu_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "江苏");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_zhejiang_btn.setText1("浙江");
        modicity_zhejiang_btn.setKey(false);
        modicity_zhejiang_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_zhejiang_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "浙江");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_anhui_btn.setText1("安徽");
        modicity_anhui_btn.setKey(false);
        modicity_anhui_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_anhui_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "安徽");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_fujian_btn.setText1("福建");
        modicity_fujian_btn.setKey(false);
        modicity_fujian_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_fujian_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "福建");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_jiangxi_btn.setText1("江西");
        modicity_jiangxi_btn.setKey(false);
        modicity_jiangxi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_jiangxi_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "江西");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_shandong_btn.setText1("山东");
        modicity_shandong_btn.setKey(false);
        modicity_shandong_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_shandong_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "山东");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_henan_btn.setText1("河南");
        modicity_henan_btn.setKey(false);
        modicity_henan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_henan_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "河南");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_hubei_btn.setText1("湖北");
        modicity_hubei_btn.setKey(false);
        modicity_hubei_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_hubei_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "湖北");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_hunan_btn.setText1("湖南");
        modicity_hunan_btn.setKey(false);
        modicity_hunan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_hunan_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "湖南");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_guangdong_btn.setText1("广东");
        modicity_guangdong_btn.setKey(false);
        modicity_guangdong_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_guangdong_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "广东");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_guangxi_btn.setText1("广西");
        modicity_guangxi_btn.setKey(false);
        modicity_guangxi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_guangxi_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "广西");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_hainan_btn.setText1("海南");
        modicity_hainan_btn.setKey(false);
        modicity_hainan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_hainan_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "海南");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_sichuan_btn.setText1("四川");
        modicity_sichuan_btn.setKey(false);
        modicity_sichuan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_sichuan_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "四川");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_guizhou_btn.setText1("贵州");
        modicity_guizhou_btn.setKey(false);
        modicity_guizhou_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_guizhou_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "贵州");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_yunnan_btn.setText1("云南");
        modicity_yunnan_btn.setKey(false);
        modicity_yunnan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_yunnan_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "云南");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_xizang_btn.setText1("西藏");
        modicity_xizang_btn.setKey(false);
        modicity_xizang_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_xizang_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "西藏");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_shan3xi_btn.setText1("陕西");
        modicity_shan3xi_btn.setKey(false);
        modicity_shan3xi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_shan3xi_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "陕西");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_gansu_btn.setText1("甘肃");
        modicity_gansu_btn.setKey(false);
        modicity_gansu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_gansu_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "甘肃");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_qinghai_btn.setText1("青海");
        modicity_qinghai_btn.setKey(false);
        modicity_qinghai_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_qinghai_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "青海");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_ningxia_btn.setText1("宁夏");
        modicity_ningxia_btn.setKey(false);
        modicity_ningxia_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_ningxia_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "宁夏");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        modicity_xinjiang_btn.setText1("新疆");
        modicity_xinjiang_btn.setKey(false);
        modicity_xinjiang_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unselect();
                modicity_xinjiang_btn.setKey(true);
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("city", "新疆");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

    private void unselect()
    {
        modicity_shanghai_btn.setKey(false);
        modicity_beijing_btn.setKey(false);
        modicity_tianjin_btn.setKey(false);
        modicity_chongqing_btn.setKey(false);
        modicity_hebei_btn.setKey(false);
        modicity_shan1xi_btn.setKey(false);
        modicity_neimenggu_btn.setKey(false);
        modicity_liaoning_btn.setKey(false);
        modicity_jilin_btn.setKey(false);
        modicity_heilongjiang_btn.setKey(false);
        modicity_jiangsu_btn.setKey(false);
        modicity_zhejiang_btn.setKey(false);
        modicity_anhui_btn.setKey(false);
        modicity_fujian_btn.setKey(false);
        modicity_jiangxi_btn.setKey(false);
        modicity_shandong_btn.setKey(false);
        modicity_henan_btn.setKey(false);
        modicity_hubei_btn.setKey(false);
        modicity_hunan_btn.setKey(false);
        modicity_guangdong_btn.setKey(false);
        modicity_guangxi_btn.setKey(false);
        modicity_hainan_btn.setKey(false);
        modicity_sichuan_btn.setKey(false);
        modicity_guizhou_btn.setKey(false);
        modicity_yunnan_btn.setKey(false);
        modicity_xizang_btn.setKey(false);
        modicity_shan3xi_btn.setKey(false);
        modicity_gansu_btn.setKey(false);
        modicity_qinghai_btn.setKey(false);
        modicity_ningxia_btn.setKey(false);
        modicity_xinjiang_btn.setKey(false); 
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            //这里写你要在用户按下返回键同时执行的动作
            moveTaskToBack(false);            //核心代码：屏蔽返回行为
            Intent intent = getIntent();
            Bundle bundle = new Bundle();
            bundle.putString("city", "上海");
            intent.putExtras(bundle);
            setResult(RESULT_OK, intent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
