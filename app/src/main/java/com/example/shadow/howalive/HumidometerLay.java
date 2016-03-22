package com.example.shadow.howalive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by 张丽娟 on 2016/3/15.
 */
public class HumidometerLay extends RelativeLayout {

    private ImageView scale1;
    private ImageView scale2;
    private ImageView scale3;
    private ImageView scale4;
    private ImageView scale5;
    private ImageView scale6;
    private ImageView scale7;
    private ImageView scale8;
    private ImageView scale9;
    private ImageView scale10;

    public HumidometerLay(Context context)
    {
        super(context,null);
    }
    public HumidometerLay(Context context,AttributeSet attributeSet)
    {
        super(context,attributeSet);

        LayoutInflater.from(context).inflate(R.layout.humidometer_lay, this, true);

        this.scale1 = (ImageView) findViewById(R.id.water_scale1);
        this.scale2 = (ImageView) findViewById(R.id.water_scale2);
        this.scale3 = (ImageView) findViewById(R.id.water_scale3);
        this.scale4 = (ImageView) findViewById(R.id.water_scale4);
        this.scale5 = (ImageView) findViewById(R.id.water_scale5);
        this.scale6 = (ImageView) findViewById(R.id.water_scale6);
        this.scale7 = (ImageView) findViewById(R.id.water_scale7);
        this.scale8 = (ImageView) findViewById(R.id.water_scale8);
        this.scale9 = (ImageView) findViewById(R.id.water_scale9);
        this.scale10 = (ImageView) findViewById(R.id.water_scale10);

        this.setClickable(true);
        this.setFocusable(true);
    }

    public void setScale1Invisable(boolean K) {
        if (!K) {
            this.scale1.setVisibility(INVISIBLE);
        }
    }
    public void setScale2Invisable(boolean K) {
        if (!K) {
            this.scale2.setVisibility(INVISIBLE);
        }
    }
    public void setScale3Invisable(boolean K) {
        if (!K) {
            this.scale3.setVisibility(INVISIBLE);
        }
    }
    public void setScale4Invisable(boolean K) {
        if (!K) {
            this.scale4.setVisibility(INVISIBLE);
        }
    }
    public void setScale5Invisable(boolean K) {
        if (!K) {
            this.scale5.setVisibility(INVISIBLE);
        }
    }
    public void setScale6Invisable(boolean K) {
        if (!K) {
            this.scale6.setVisibility(INVISIBLE);
        }
    }
    public void setScale7Invisable(boolean K) {
        if (!K) {
            this.scale7.setVisibility(INVISIBLE);
        }
    }
    public void setScale8Invisable(boolean K) {
        if (!K) {
            this.scale8.setVisibility(INVISIBLE);
        }
    }
    public void setScale9Invisable(boolean K) {
        if (!K) {
            this.scale9.setVisibility(INVISIBLE);
        }
    }
    public void setScale10Invisable(boolean K) {
        if (!K) {
            this.scale10.setVisibility(INVISIBLE);
        }
    }

}
