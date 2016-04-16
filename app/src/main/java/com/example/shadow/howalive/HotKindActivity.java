package com.example.shadow.howalive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.TextView;


/**
 * Created by 张丽娟 on 2016/3/17.
 * Edited by Shadow on 2016/3/21.
 */
public class HotKindActivity extends Activity {

    TextView titlebar;
    Button ret_btn;
    KindUnitButton kind1;
    KindUnitButton kind2;
    KindUnitButton kind3;
    KindUnitButton kind4;
    KindUnitButton kind5;
    KindUnitButton kind6;
    KindUnitButton kind7;
    KindUnitButton kind8;
    KindUnitButton kind9;
    KindUnitButton kind10;
    KindUnitButton kind11;
    KindUnitButton kind12;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.hotkind);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);
        init();
    }

    private void init()
    {
        titlebar = (TextView)findViewById(R.id.header_text);
        ret_btn = (Button)findViewById(R.id.header_left_btn);
        kind1 = (KindUnitButton)findViewById(R.id.kind1);
        kind2 = (KindUnitButton)findViewById(R.id.kind2);
        kind3 = (KindUnitButton)findViewById(R.id.kind3);
        kind4 = (KindUnitButton)findViewById(R.id.kind4);
        kind5 = (KindUnitButton)findViewById(R.id.kind5);
        kind6 = (KindUnitButton)findViewById(R.id.kind6);
        kind7 = (KindUnitButton)findViewById(R.id.kind7);
        kind8 = (KindUnitButton)findViewById(R.id.kind8);
        kind9 = (KindUnitButton)findViewById(R.id.kind9);
        kind10 = (KindUnitButton)findViewById(R.id.kind10);
        kind11 = (KindUnitButton)findViewById(R.id.kind11);
        kind12 = (KindUnitButton)findViewById(R.id.kind12);

        ret_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("plant", "无");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
        titlebar.setText("热门植物");

        kind1.setImgResource(R.drawable.shuixian);
        kind1.setText("水仙");
        kind1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("plant", "水仙");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        kind2.setImgResource(R.drawable.xianrenzhang);
        kind2.setText("仙人掌");
        kind2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("plant", "仙人掌");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        kind3.setImgResource(R.drawable.junzilan);
        kind3.setText("君子兰");
        kind3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("plant", "君子兰");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        kind4.setImgResource(R.drawable.juhua);
        kind4.setText("菊花");
        kind4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("plant", "菊花");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        kind5.setImgResource(R.drawable.diaolan);
        kind5.setText("吊兰");
        kind5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("plant", "吊兰");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        kind6.setImgResource(R.drawable.lvluo);
        kind6.setText("绿萝");
        kind6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("plant", "绿萝");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        kind7.setImgResource(R.drawable.luhui);
        kind7.setText("芦荟");
        kind7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("plant", "芦荟");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        kind8.setImgResource(R.drawable.facaishu);
        kind8.setText("发财树");
        kind8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("plant", "发财树");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        kind9.setImgResource(R.drawable.yanzizhang);
        kind9.setText("燕子掌");
        kind9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("plant", "燕子掌");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        kind10.setImgResource(R.drawable.baizhang);
        kind10.setText("白掌");
        kind10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("plant", "白掌");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        kind11.setImgResource(R.drawable.hanxiucao);
        kind11.setText("含羞草");
        kind11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("plant", "含羞草");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        kind12.setImgResource(R.drawable.xiangxueqiu);
        kind12.setText("香雪球");
        kind12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putString("plant", "香雪球");
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            //这里写你要在用户按下返回键同时执行的动作
            moveTaskToBack(false);            //核心代码：屏蔽返回行为
            Intent intent = getIntent();
            Bundle bundle = new Bundle();
            bundle.putString("plant", "无");
            intent.putExtras(bundle);
            setResult(RESULT_OK, intent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
