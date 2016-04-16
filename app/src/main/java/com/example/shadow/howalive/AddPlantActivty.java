package com.example.shadow.howalive;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Calendar;

/**
 * Created by Shadow on 2016/3/13.
 */
public class AddPlantActivty extends Activity {
    TextView header_text;
    Button btn_ret;
    Button btn_fin_other;
    Button btn_fin_this;
    Button btn_add_plant;
    Button btn_add_time;
    EditText add_name;
    CircleImageView btn_headphoto;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.add_plant);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);
        MyApp.getInstance().addActivity(this);
        init();
    }

    private void init() {
        header_text = (TextView)findViewById(R.id.header_text);
        btn_ret = (Button)findViewById(R.id.header_left_btn);
        btn_fin_other = (Button)findViewById(R.id.add_next);
        btn_fin_this = (Button)findViewById(R.id.add_add);
        btn_headphoto = (CircleImageView)findViewById(R.id.add_headphoto_circleimageview);
        btn_add_plant = (Button)findViewById(R.id.add_kind_button);
        btn_add_time = (Button)findViewById(R.id.add_time_button);
        add_name = (EditText)findViewById(R.id.add_name_edittext);

        btn_add_plant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(AddPlantActivty.this, HotKindActivity.class);
                startActivityForResult(intent,1);
            }
        });
        btn_add_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(AddPlantActivty.this, DataSelectActivity.class);
//                startActivityForResult(intent,2);
                DatePickerF DPD = new DatePickerF();
                DPD.show(getFragmentManager(), "datePicker");
            }
        });
        add_name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (add_name.getText().toString() != null && !add_name.getText().toString().equals("")) {
                    btn_fin_this.setEnabled(true);
//                    btn_fin.setGravity(Gravity.CENTER_HORIZONTAL);
                    btn_fin_this.setBackgroundResource(R.drawable.cir_button2);
                } else {
                    btn_fin_this.setEnabled(false);
                    btn_fin_this.setGravity(Gravity.CENTER);
                    btn_fin_this.setPadding(20,15,20,15);
                    btn_fin_this.setBackgroundResource(R.drawable.cir_btr);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        btn_headphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                intent.setType("image/*");
                intent.putExtra("crop", "true");
                intent.putExtra("aspectX", 1);
                intent.putExtra("aspectY", 1);
                intent.putExtra("outputX", 30);
                intent.putExtra("outputY", 30);
                intent.putExtra("return-data", true);
                startActivityForResult(intent, 0);
            }
        });
        header_text.setText("添加植物   ");
        btn_ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_fin_other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddPlantActivty.this, MainActivity.class);
                startActivity(intent);
                MyApp.getInstance().exit();
            }
        });
        btn_fin_this.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddPlantActivty.this, MainActivity.class);
                startActivity(intent);
                MyApp.getInstance().exit();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        System.out.println(resultCode);
//        Bitmap cameraBitmap = (Bitmap) data.getExtras().get("data");
//        head_photo.setImageBitmap(CompBitmap.comp(cameraBitmap));
//        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 0) {
            ContentResolver resolver = getContentResolver();
            Bitmap myBitmap = null;
            //处理本地图库返回的数据
            try {
                //获得图片的uri
                Uri originalUri = data.getData();
                //将图片内容解析成字节数组
                byte[] mContent = readStream(resolver.openInputStream(Uri.parse(originalUri.toString())));
                //将字节数组转换为ImageView可调用的Bitmap对象
                myBitmap = getPicFromBytes(mContent, null);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            myBitmap = CompBitmap.comp(myBitmap);
            //把得到的图片绑定在控件上显示
            btn_headphoto.setImageBitmap(myBitmap);
        }
        else if (requestCode == 1)
        {
            super.onActivityResult(requestCode, resultCode, data);
            Bundle bundle = data.getExtras();
            if(bundle != null){
                //获取b传送的数据
                String plant = bundle.getString("plant");
                btn_add_plant.setText(plant);
                btn_add_plant.setTextColor(Color.BLACK);
            }
        }
        else
        {
            super.onActivityResult(requestCode, resultCode, data);
            Bundle bundle = data.getExtras();
            if(bundle != null){
                //获取b传送的数据
                String time = bundle.getString("time");
                btn_add_time.setText(time);
            }
        }
    }
    public static Bitmap getPicFromBytes(byte[] bytes, BitmapFactory.Options opts) {
        if (bytes != null)
            if (opts != null)
                return BitmapFactory.decodeByteArray(bytes, 0, bytes.length,opts);
            else
                return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        return null;
    }

    public static byte[] readStream(InputStream inStream) throws Exception {
        byte[] buffer = new byte[1024];
        int len = -1;
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        while ((len = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, len);
        }
        byte[] data = outStream.toByteArray();
        outStream.close();
        inStream.close();
        return data;

    }

    class DatePickerF extends DialogFragment implements DatePickerDialog.OnDateSetListener {
        int _year = 1970;
        int _month = 0;
        int _day = 0;
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);
            return new DatePickerDialog(getActivity(),this,year,month,day);
        }
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            _year = year;
            _month = monthOfYear + 1;
            _day = dayOfMonth;
            btn_add_time.setText(""+_year+"年"+_month+"月"+_day+"日");
            btn_add_time.setTextColor(Color.BLACK);
//        Log.i(Constant.LOG_TAG, "year="+year+",monthOfYear="+monthOfYear+",dayOfMonth="+dayOfMonth);
        }
        public String getValue()
        {
            return ""+_year+"年"+_month+"月"+_day+"日";
        }

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            //这里写你要在用户按下返回键同时执行的动作
            moveTaskToBack(false);            //核心代码：屏蔽返回行为
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
