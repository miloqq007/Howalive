package com.example.shadow.howalive;

import android.content.Context;
import android.media.Image;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
/**
 * Created by 张丽娟 on 2016/3/14.
 */
public class ImgTxtImgButton extends RelativeLayout {

    private ImageView imageview1;
    private TextView textview;
    private ImageView imageview2;

    public ImgTxtImgButton(Context context)
    {
        super(context,null);
    }
    public ImgTxtImgButton(Context context,AttributeSet attributeSet)
    {
        super(context,attributeSet);

        LayoutInflater.from(context).inflate(R.layout.imgtxtimg_btn, this, true);

        this.imageview1 = (ImageView) findViewById(R.id.list2_image_left);
        this.textview = (TextView)findViewById(R.id.list2_name);
        this.imageview2 = (ImageView)findViewById(R.id.list2_image_arrow);

        this.setClickable(true);
        this.setFocusable(true);
    }

    public void setText(String text)
    {
        this.textview.setText(text);
    }

    public void setTextColor(int color)
    {
        this.textview.setTextColor(color);
    }

    public void setTextSize(float size)
    {
        this.textview.setTextSize(size);
    }

    public void setImg1Resource(int resourceID)
    {
        this.imageview1.setImageResource(resourceID);
    }
    public void setImg2Resource(int resourceID)
    {
        this.imageview2.setImageResource(resourceID);
    }
    public void setKey(boolean K) {
        if (K) {
            setImg1Resource(R.drawable.sun);
        }
    }
}
