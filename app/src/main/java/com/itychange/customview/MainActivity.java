package com.itychange.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import view.CustomView;

public class MainActivity extends AppCompatActivity {

    CustomView mCustomView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
