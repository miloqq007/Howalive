package com.example.shadow.howalive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by 张丽娟 on 2016/3/20.
 */
public class HomePlantListButton extends RelativeLayout {

    private ImageView imageviewhead;
    private TextView textviewname;
    private TextView textviewday;

    public HomePlantListButton(Context context)
    {
        super(context,null);
    }
    public HomePlantListButton(Context context,AttributeSet attributeSet)
    {
        super(context, attributeSet);

        LayoutInflater.from(context).inflate(R.layout.home_plant_list_btn, this, true);

        this.imageviewhead = (ImageView) findViewById(R.id.home_plant_headimg);
        this.textviewname = (TextView)findViewById(R.id.home_plant_name);
        this.textviewday = (TextView)findViewById(R.id.home_plant_day);

        this.setClickable(true);
        this.setFocusable(true);
    }

    public void setImgResource(int resourceID)
    {
        this.imageviewhead.setImageResource(resourceID);
    }

    public void setTextName(String text)
    {
        this.textviewname.setText(text);
    }

    public void setTextNameColor(int color)
    {
        this.textviewname.setTextColor(color);
    }

    public void setTextNameSize(float size)
    {
        this.textviewname.setTextSize(size);
    }

    public void setTextDay(String text)
    {
        this.textviewday.setText(text);
    }

    public void setTextDayColor(int color)
    {
        this.textviewday.setTextColor(color);
    }

    public void setTextDaySize(float size)
    {
        this.textviewday.setTextSize(size);
    }
}

