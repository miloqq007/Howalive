package com.example.shadow.howalive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Shadow on 2016/3/15.
 */
public class Fragment4 extends Fragment {

    private Button personalEditData;
    private Button personalSetting;
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fg4, container,false);
        personalEditData = (Button)view.findViewById(R.id.personal_edit_data_btn);
        personalEditData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(getActivity(),PersonalInfoActivity.class);
                startActivity(myintent);
            }
        });
        personalSetting = (Button)view.findViewById(R.id.personal_set_btn);
        personalSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingintent = new Intent(getActivity(),SettingActivity.class);
                startActivity(settingintent);
            }
        });
        return view;
    }

}
