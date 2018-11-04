package com.bwie.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolBar = findViewById(R.id.tool_bar);

        //设置控件
        mToolBar.setTitle("大转盘抽奖");
        //设置副标题
        mToolBar.setSubtitle("人人有奖");

        //设置Toolbar
        setSupportActionBar(mToolBar);

        //设置系统默认的返回箭头
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
