package com.example.shadow.howalive;

import android.app.Activity;
import android.os.Bundle;
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
        titlebar = (TextView)findViewById(R.id.header_text);
        titlebar.setText("热门植物");
        ret_btn = (Button)findViewById(R.id.header_left_btn);
        ret_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        kind1 = (KindUnitButton)findViewById(R.id.kind1);
        kind1.setImgResource(R.drawable.shuixian);
        kind1.setText("水仙");

        kind2 = (KindUnitButton)findViewById(R.id.kind2);
        kind2.setImgResource(R.drawable.xianrenzhang);
        kind2.setText("仙人掌");

        kind3 = (KindUnitButton)findViewById(R.id.kind3);
        kind3.setImgResource(R.drawable.junzilan);
        kind3.setText("君子兰");

        kind4 = (KindUnitButton)findViewById(R.id.kind4);
        kind4.setImgResource(R.drawable.juhua);
        kind4.setText("菊花");

        kind5 = (KindUnitButton)findViewById(R.id.kind5);
        kind5.setImgResource(R.drawable.diaolan);
        kind5.setText("吊兰");

        kind6 = (KindUnitButton)findViewById(R.id.kind6);
        kind6.setImgResource(R.drawable.lvluo);
        kind6.setText("绿萝");

        kind7 = (KindUnitButton)findViewById(R.id.kind7);
        kind7.setImgResource(R.drawable.luhui);
        kind7.setText("芦荟");

        kind8 = (KindUnitButton)findViewById(R.id.kind8);
        kind8.setImgResource(R.drawable.facaishu);
        kind8.setText("发财树");

        kind9 = (KindUnitButton)findViewById(R.id.kind9);
        kind9.setImgResource(R.drawable.yanzizhang);
        kind9.setText("燕子掌");

        kind10 = (KindUnitButton)findViewById(R.id.kind10);
        kind10.setImgResource(R.drawable.baizhang);
        kind10.setText("白掌");

        kind11 = (KindUnitButton)findViewById(R.id.kind11);
        kind11.setImgResource(R.drawable.hanxiucao);
        kind11.setText("含羞草");

        kind12 = (KindUnitButton)findViewById(R.id.kind12);
        kind12.setImgResource(R.drawable.xiangxueqiu);
        kind12.setText("香雪球");

    }
}
