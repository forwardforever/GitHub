package com.bawei.githut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        TextView tv = (TextView) findViewById(R.id.tv);
        ImageView iv = (ImageView) findViewById(R.id.iv);
		//这是一次提交
		//这又是一次提交

    }
}
