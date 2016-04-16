package com.example.shadow.howalive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by 张丽娟 on 2016/3/7.
 */
public class Fragment2 extends Fragment{

    LinearLayout fg2;
    View line[] = new View[5];
    PlantListButton rl[] = new PlantListButton[5];
//    PlantListButton myplant_list_btn[];
    PlantListButton myplant2_list_btn;
    String text_name[] = new String[5];
    String text_kind[] = new String[5];
    String text_day[] = new String[5];
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg2, container,false);


        fg2 = (LinearLayout)view.findViewById(R.id.fg2_layout);

        for(int i = 0; i < 2; i++)
        {
            line[i] = inflater.inflate(R.layout.line,null).findViewById(R.id.line);
            line[i].setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 5));
            text_name[i] = "小米粥";
            text_kind[i] = "水仙";
            text_day[i] = "32天";
        }


        for(int i = 0; i < 2; i++) {
            rl[i] = (PlantListButton)inflater.inflate(R.layout.plb,null).findViewById(R.id.p_list_btn);
            fg2.addView(rl[i]);
            fg2.addView(line[i]);
//            rl[i] = (PlantListButton) view.findViewById(R.id.myplant1_list);
            rl[i].setTextName(text_name[i]);
            rl[i].setTextKind(text_kind[i]);
            rl[i].setTextDay(text_day[i]);
            rl[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent plantdetialintent = new Intent(getActivity(), PlantDetialActivity.class);
                    startActivity(plantdetialintent);
                }
            });
        }

//        myplant2_list_btn = (PlantListButton)view.findViewById(R.id.myplant2_list);
//        myplant2_list_btn.setTextName("小馒头");
//        myplant2_list_btn.setTextKind("仙人掌");
//        myplant2_list_btn.setTextDay("10天");
//        myplant2_list_btn.setImgResource(R.drawable.plant_head2);

        return view;
    }

}
