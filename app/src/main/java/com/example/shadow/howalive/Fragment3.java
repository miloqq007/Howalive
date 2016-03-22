package com.example.shadow.howalive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 张丽娟 on 2016/3/7.
 */
public class Fragment3 extends Fragment{

    ImgTxtImgButton action_water_btn;
    ImgTxtImgButton action_light_btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg3, container,false);

        action_water_btn = (ImgTxtImgButton)view.findViewById(R.id.action_waterbtn);
        action_water_btn.setText("浇水");
        action_water_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent waterintent = new Intent(getActivity(), WaterSelectPlantActivity.class);
                startActivity(waterintent);
            }
        });

        action_light_btn = (ImgTxtImgButton)view.findViewById(R.id.action_lightbtn);
        action_light_btn.setText("调光");
        action_light_btn.setKey(true);
        action_light_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lightintent = new Intent(getActivity(), LightSelectPlantActivity.class);
                startActivity(lightintent);
            }
        });
        return view;
    }

}
