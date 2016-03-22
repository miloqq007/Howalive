package com.example.shadow.howalive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Shadow on 2016/3/15.
 */
public class Text2ImageButton extends RelativeLayout {

    private TextView textview1;
    private TextView textview2;
    private ImageView imageview;

    public Text2ImageButton(Context context)
    {
        super(context,null);
    }
    public Text2ImageButton(Context context,AttributeSet attributeSet)
    {
        super(context,attributeSet);

        LayoutInflater.from(context).inflate(R.layout.text2image_btn, this, true);

        this.textview1 = (TextView)findViewById(R.id.list_text_name);
        this.textview2 = (TextView)findViewById(R.id.list_name);
        this.imageview = (ImageView)findViewById(R.id.list_image_arrow);

        this.setClickable(true);
        this.setFocusable(true);
    }

    public void setText1(String text)
    {
        this.textview1.setText(text);
    }
    public void setText2(String text)
    {
        this.textview2.setText(text);
    }

    public void setText1Color(int color)
    {
        this.textview1.setTextColor(color);
    }
    public void setText2Color(int color)
    {
        this.textview2.setTextColor(color);
    }

    public void setText1Size(float size)
    {
        this.textview1.setTextSize(size);
    }
    public void setText2Size(float size)
    {
        this.textview2.setTextSize(size);
    }

    public void setImgResource(int resourceID)
    {
        this.imageview.setImageResource(resourceID);
    }
    public void setKey(boolean K) {
        if (K) {
            setImgResource(R.drawable.selected_icon);
        } else {
            this.imageview.setVisibility(INVISIBLE);
        }
    }

}
