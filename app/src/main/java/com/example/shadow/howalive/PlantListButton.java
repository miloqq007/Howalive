package com.example.shadow.howalive;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by 张丽娟 on 2016/3/15.
 */
public class PlantListButton extends RelativeLayout {

    private ImageView imageviewhead;
    private TextView textviewname;
    private TextView textviewkind;
    private TextView textviewday;

    public PlantListButton(Context context)
    {
        super(context,null);
    }
    public PlantListButton(Context context,AttributeSet attributeSet)
    {
        super(context, attributeSet);

        LayoutInflater.from(context).inflate(R.layout.plant_list_btn, this, true);

        this.imageviewhead = (ImageView) findViewById(R.id.plant1_headimg);
        this.textviewname = (TextView)findViewById(R.id.plant1_name);
        this.textviewkind = (TextView)findViewById(R.id.plant1_kind);
        this.textviewday = (TextView)findViewById(R.id.plant1_day);
        this.setBackgroundColor(Color.WHITE);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0,0,0,10);
        this.setLayoutParams(layoutParams);
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
    public void setTextKind(String text)
    {
        this.textviewkind.setText(text);
    }

    public void setTextKindColor(int color)
    {
        this.textviewkind.setTextColor(color);
    }

    public void setTextKindSize(float size)
    {
        this.textviewkind.setTextSize(size);
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
