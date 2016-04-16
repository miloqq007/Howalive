package com.example.shadow.howalive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by 张丽娟 on 2016/3/20.
 */
public class WarningBox extends LinearLayout {

    TextView warning_time;
    CircleImageView warning_plant_headimg;
    TextView warning_plant_name;
    TextView warning_plant_kind;
    TextView warning_situation;
    TextView warning_current_temp;
    TextView warning_current_hum;
    TextView warning_current_light;
    TextView warning_standerd_value;

    public WarningBox(Context context)
    {
        super(context,null);
    }
    public WarningBox(Context context,AttributeSet attributeSet)
    {
        super(context,attributeSet);

        LayoutInflater.from(context).inflate(R.layout.warning_box, this, true);

        this.warning_time = (TextView)findViewById(R.id.warning_time);
        this.warning_plant_headimg = (CircleImageView)findViewById(R.id.warning_plant_headimg);
        this.warning_plant_name = (TextView)findViewById(R.id.warning_plant_name);
        this.warning_plant_kind = (TextView)findViewById(R.id.warning_plant_kind);
        this.warning_situation = (TextView)findViewById(R.id.warning_situation);
        this.warning_current_temp = (TextView)findViewById(R.id.warning_current_temp);
        this.warning_current_hum = (TextView)findViewById(R.id.warning_current_hum);
        this.warning_current_light = (TextView)findViewById(R.id.warning_current_light);
        this.warning_standerd_value = (TextView)findViewById(R.id.warning_standerd_value);

        this.setClickable(true);
        this.setFocusable(true);
    }
    public void setTextWarningTime(String text) {this.warning_time.setText(text);}
    public void setPlantHeadImg(int resourceID)
    {
        this.warning_plant_headimg.setImageResource(resourceID);
    }
    public void setTextPlantName(String text)
    {
        this.warning_plant_name.setText(text);
    }
    public void setTextPlantKind(String text)
    {
        this.warning_plant_kind.setText(text);
    }
    public void setTextWarningSituation(String text)
    {
        this.warning_situation.setText(text);
    }
    public void setTextCurrentTemp(String text)
    {
        this.warning_current_temp.setText(text);
    }
    public void setTextCurrentHum(String text) {this.warning_current_hum.setText(text);}
    public void setTextCurrentLight(String text) {this.warning_current_light.setText(text);}
    public void setTextStanderdValue(String text) {this.warning_standerd_value.setText(text);}

    public void setColorCurrentTemp(int color) {this.warning_current_temp.setTextColor(color);}
    public void setColorCurrentHum(int color) {this.warning_current_hum.setTextColor(color);}
    public void setColorCurrentLight(int color) {this.warning_current_light.setTextColor(color);}

}
