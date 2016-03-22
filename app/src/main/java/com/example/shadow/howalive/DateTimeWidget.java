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
public class DateTimeWidget extends RelativeLayout {

    TextView date;
    TextView time;

    public DateTimeWidget(Context context)
    {
        super(context,null);
    }
    public DateTimeWidget(Context context,AttributeSet attributeSet)
    {
        super(context, attributeSet);

        LayoutInflater.from(context).inflate(R.layout.date_time_widget, this, true);

        this.date = (TextView)findViewById(R.id.plant_detial_date);
        this.time =(TextView)findViewById(R.id.plant_detial_time);
        this.setClickable(true);
        this.setFocusable(true);
    }

    public void setTextDate(String text)
    {
        this.date.setText(text);
    }
    public void setTextTime(String text)
    {
        this.time.setText(text);
    }

}
