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
public class KindUnitButton extends RelativeLayout {

    private CircleImageView kindicon;
    private TextView kindname;

    public KindUnitButton(Context context)
    {
        super(context, null);
    }
    public KindUnitButton(Context context,AttributeSet attributeSet)
    {
        super(context, attributeSet);

        LayoutInflater.from(context).inflate(R.layout.kind_unit, this, true);

        this.kindicon = (CircleImageView)findViewById(R.id.kind_image);
        this.kindname = (TextView)findViewById(R.id.kind_name);

        this.setClickable(true);
        this.setFocusable(true);
    }

    public void setText(String text)
    {
        this.kindname.setText(text);
    }

    public void setTextColor(int color)
    {
        this.kindname.setTextColor(color);
    }

    public void setTextSize(float size)
    {
        this.kindname.setTextSize(size);
    }

    public void setImgResource(int resourceID)
    {
        this.kindicon.setImageResource(resourceID);
    }
}
