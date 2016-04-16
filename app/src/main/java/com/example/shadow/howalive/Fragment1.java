package com.example.shadow.howalive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Shadow on 2016/3/15.
 */
public class Fragment1 extends Fragment {

    CircleImageView home_user_head;
    TextView home_user_name;
    ImageView home_user_sex;
    TextView home_date;
    TextView home_city;
    HomePlantListButton home_plant1_btn;
    HomePlantListButton home_plant2_btn;
    WarningBox home_warning1;
    WarningBox home_warning2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg1, container, false);

        home_user_head = (CircleImageView) view.findViewById(R.id.home_user_head);
        home_user_name = (TextView) view.findViewById(R.id.home_user_name);
        home_user_sex = (ImageView) view.findViewById(R.id.home_user_sex);
        home_date = (TextView) view.findViewById(R.id.home_date);
        home_city = (TextView) view.findViewById(R.id.home_city);

        home_plant1_btn = (HomePlantListButton) view.findViewById(R.id.home_plant1_btn);
        home_plant1_btn.setImgResource(R.drawable.plant_head1);
        home_plant1_btn.setTextName("小米粥");
        home_plant1_btn.setTextDay("已养32天");
        home_plant1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeplantdetialintent = new Intent(getActivity(), HomePlantDetialActivity.class);
                startActivity(homeplantdetialintent);
            }
        });

        home_plant2_btn = (HomePlantListButton) view.findViewById(R.id.home_plant2_btn);
        home_plant2_btn.setImgResource(R.drawable.try2);
        home_plant2_btn.setTextName("小馒头");
        home_plant2_btn.setTextDay("已养10天");

        home_warning1 = (WarningBox) view.findViewById(R.id.home_warning1);
        home_warning1.setTextWarningTime("警告 — 9:00");
        home_warning1.setPlantHeadImg(R.drawable.plant_head1);
        home_warning1.setTextPlantName("小米粥");
        home_warning1.setTextPlantKind("水仙");
        home_warning1.setTextWarningSituation("需要浇水啦！");
        home_warning1.setTextCurrentTemp("温度：16℃");
        home_warning1.setTextCurrentHum("湿度：60%");
        home_warning1.setColorCurrentHum(R.color.warning_red);
        home_warning1.setTextCurrentLight("光照：充足");
        home_warning1.setTextStanderdValue("湿度：80%");

        home_warning2 = (WarningBox) view.findViewById(R.id.home_warning2);
        home_warning2.setTextWarningTime("警告 — 14:00");
        home_warning2.setPlantHeadImg(R.drawable.plant_head2);
        home_warning2.setTextPlantName("小馒头");
        home_warning2.setTextPlantKind("仙人掌");
        home_warning2.setTextWarningSituation("需要浇水啦！");
        home_warning2.setTextCurrentTemp("温度：16℃");
        home_warning2.setTextCurrentHum("湿度：20%");
        home_warning2.setColorCurrentHum(R.color.warning_red);
        home_warning2.setTextCurrentLight("光照：充足");
        home_warning2.setTextStanderdValue("湿度：40%");
        return view;
    }

    private void init() {

    }

}
