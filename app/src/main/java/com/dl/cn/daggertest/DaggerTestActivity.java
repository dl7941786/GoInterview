package com.dl.cn.daggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.dl.cn.R;
import com.dl.cn.mvpbase.BaseActivity;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

public class DaggerTestActivity extends BaseActivity<TestPresenter> implements TestContract.View {

    private static final String TAG = DaggerTestActivity.class.getSimpleName();
    private TextView test_tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_test);
        test_tv = findViewById(R.id.test_tv);

    }


    @Override
    public void loadData(String testBean) {
        Log.e(TAG, "loadData: " + testBean);
        test_tv.setText(testBean);
    }

    @Override
    public void onError() {
        Log.e(TAG, "onEror: ");
    }

    public void getdata(View view) {
        presenter.getData();
    }
}
