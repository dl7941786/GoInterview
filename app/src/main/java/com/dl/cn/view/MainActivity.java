package com.dl.cn.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.dl.cn.App;
import com.dl.cn.R;
import com.dl.cn.daggertest.DaggerTestActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: " + (App.context != null));
    }

    public void go_test(View view) {
        startActivity(new Intent(this, DaggerTestActivity.class));
    }
}
