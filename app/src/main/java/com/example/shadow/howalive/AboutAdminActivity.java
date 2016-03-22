package com.example.shadow.howalive;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * Created by Shadow on 2016/3/10.
 */
public class AboutAdminActivity extends Activity {
    TextView header_text;
    Button btn_ret;
    Button btn_fin;
    Button btn_city;
    CircleImageView head_photo;
    RadioGroup sex_radio;
    RadioButton man_button;
    RadioButton woman_button;
    EditText detail;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.about_admin);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_titlebar);
        MyApp.getInstance().addActivity(this);
        init();
    }

    private void init() {
        header_text = (TextView)findViewById(R.id.header_text);
        detail = (EditText)findViewById(R.id.about_name_edittext);
        sex_radio = (RadioGroup)findViewById(R.id.about_sex_radiogroup);
        man_button = (RadioButton)findViewById(R.id.about_man_rad);
        woman_button = (RadioButton)findViewById(R.id.about_woman_rad);
        head_photo = (CircleImageView)findViewById(R.id.about_headphoto_circleimageview);
        btn_ret = (Button)findViewById(R.id.header_left_btn);
        btn_fin = (Button)findViewById((R.id.about_finish_button));
        btn_city = (Button)findViewById(R.id.about_city_button);

        man_button.setChecked(true);
        btn_fin.setEnabled(false);
        header_text.setText("主人资料   ");
        btn_city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(AboutAdminActivity.this,ModifyCityActivity.class);
                startActivityForResult(intent,1);
            }
        });
        detail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (detail.getText().toString() != null && !detail.getText().toString().equals("")) {
                    btn_fin.setEnabled(true);
//                    btn_fin.setGravity(Gravity.CENTER_HORIZONTAL);
                    btn_fin.setBackgroundResource(R.drawable.cir_button2);
                } else {
                    btn_fin.setEnabled(false);
                    btn_fin.setGravity(Gravity.CENTER);
                    btn_fin.setBackgroundResource(R.drawable.cir_btr);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (detail.getText().toString() != null && !detail.getText().toString().equals("")) {
                    btn_fin.setEnabled(true);
//                    btn_fin.setGravity(Gravity.CENTER_HORIZONTAL);
                    btn_fin.setBackgroundResource(R.drawable.cir_button2);
                } else {
                    btn_fin.setEnabled(false);
                    btn_fin.setGravity(Gravity.CENTER);
                    btn_fin.setBackgroundResource(R.drawable.cir_btr);
                }
            }
        });
        head_photo.setOnClickListener(new View.OnClickListener() {
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

        btn_ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutAdminActivity.this, AddPlantActivty.class);
                startActivity(intent);
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
            head_photo.setImageBitmap(myBitmap);
        }
        else
        {
            super.onActivityResult(requestCode, resultCode, data);
            Bundle bundle = data.getExtras();
            if(bundle != null){
                //获取b传送的数据
                String city = bundle.getString("city");
                btn_city.setText(city);
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

}
