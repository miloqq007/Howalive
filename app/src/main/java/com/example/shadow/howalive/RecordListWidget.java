package com.example.shadow.howalive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Timer;

/**
 * Created by 张丽娟 on 2016/3/17.
 */
public class RecordListWidget extends RelativeLayout {

    ImageView plant_detial_icon;
    TextView plant_detial_text;

    public RecordListWidget(Context context)
    {
        super(context,null);
    }
    public RecordListWidget(Context context,AttributeSet attributeSet)
    {
        super(context, attributeSet);

        LayoutInflater.from(context).inflate(R.layout.record_list, this, true);

        this.plant_detial_icon = (ImageView)findViewById(R.id.plant_detial_icon);
        this.plant_detial_text =(TextView)findViewById(R.id.plant_detial_record_text);
        this.setClickable(true);
        this.setFocusable(true);
    }

    public void setIconResource(int resourceID)
    {
        this.plant_detial_icon.setImageResource(resourceID);
    }
    public void setTextRecord(String text)
    {
        this.plant_detial_text.setText(text);
    }

    public void setTxt(int k)
    {
        switch (k){
            case 1:
                this.setTextRecord("我来到了主人家！");
                break;
            case 2:
                this.setTextRecord("主人帮我浇水啦！");
                break;
            case 3:
                this.setTextRecord("主人帮我调光啦！");
                break;
            case 4:
                this.setTextRecord("缺水警告！");
                break;
            case 5:
                this.setTextRecord("缺光警告！");
                break;
            case 6:
                this.setTextRecord("水过多警告！");
                break;
            case 7:
                this.setTextRecord("光过强警告！");
                break;
        }
    }

    public void setIcon(int k)
    {
        switch (k){
            case 1:
                this.setIconResource(R.drawable.plant_detial_home);
                break;
            case 2:
                this.setIconResource(R.drawable.plant_detial_water);
                break;
            case 3:
                this.setIconResource(R.drawable.plant_detial_sun);
                break;
            case 4:
                this.setIconResource(R.drawable.plant_detial_warning);
                break;
        }
    }
}

