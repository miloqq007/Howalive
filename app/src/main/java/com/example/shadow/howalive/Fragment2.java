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
public class Fragment2 extends Fragment{

    PlantListButton myplant1_list_btn;
    PlantListButton myplant2_list_btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg2, container,false);

        myplant1_list_btn = (PlantListButton)view.findViewById(R.id.myplant1_list);
        myplant1_list_btn.setTextName("小米粥");
        myplant1_list_btn.setTextKind("水仙");
        myplant1_list_btn.setTextDay("32天");
        myplant1_list_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent plantdetialintent = new Intent(getActivity(),PlantDetialActivity.class);
                startActivity(plantdetialintent);
            }
        });

        myplant2_list_btn = (PlantListButton)view.findViewById(R.id.myplant2_list);
        myplant2_list_btn.setTextName("小馒头");
        myplant2_list_btn.setTextKind("仙人掌");
        myplant2_list_btn.setTextDay("10天");
        myplant2_list_btn.setImgResource(R.drawable.plant_head2);

        return view;
    }

}
