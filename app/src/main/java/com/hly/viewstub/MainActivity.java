package com.hly.viewstub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ViewStub vs0,viewStub,vs1;
    private ImageView img;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewStub = findViewById(R.id.vs);
        vs1 = findViewById(R.id.vs1);

        vs0 = findViewById(R.id.vs0);
        vs0.inflate();//一定要在img的 findViewById 之前调用inflate()方法否则会抱空指针异常
        img = findViewById(R.id.img_img);
        img.setImageResource(R.mipmap.image);

    }
    public  void inflate(View view){
        viewStub.inflate();
        img = findViewById(R.id.img_img);
        img.setImageResource(R.mipmap.image);
    }

    public void setData(View view){
        vs1.inflate();
        img = findViewById(R.id.img_img);
        img.setImageResource(R.mipmap.img);
    }


}
