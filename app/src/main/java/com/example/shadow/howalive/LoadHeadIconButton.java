package com.example.shadow.howalive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by 张丽娟 on 2016/3/17.
 */
public class LoadHeadIconButton extends RelativeLayout {

    private TextView listname;
    private CircleImageView headicon;
    private ImageView imagearrow;

    public LoadHeadIconButton(Context context)
    {
        super(context, null);
    }
    public LoadHeadIconButton(Context context,AttributeSet attributeSet)
    {
        super(context,attributeSet);

        LayoutInflater.from(context).inflate(R.layout.load_headicon_btn, this, true);

        this.listname = (TextView)findViewById(R.id.listhead_text_name);
        this.headicon = (CircleImageView)findViewById(R.id.listhead_image_head);
        this.imagearrow = (ImageView)findViewById(R.id.listhead_image_arrow);

        this.setClickable(true);
        this.setFocusable(true);
    }

    public void setText(String text)
    {
        this.listname.setText(text);
    }

    public void setTextColor(int color)
    {
        this.listname.setTextColor(color);
    }

    public void setTextSize(float size)
    {
        this.listname.setTextSize(size);
    }

    public void setImgResource(int resourceID)
    {
        this.headicon.setImageResource(resourceID);
    }
}