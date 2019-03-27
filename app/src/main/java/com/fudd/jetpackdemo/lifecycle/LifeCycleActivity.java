package com.fudd.jetpackdemo.lifecycle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.fudd.jetpackdemo.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import butterknife.ButterKnife;

/**
 * 作者: 付殿东
 * 时间: 2019/3/26
 * 描述：
 */
public class LifeCycleActivity extends AppCompatActivity implements LifecycleOwner{

    private static final String TAG = LifeCycleActivity.class.getSimpleName();


    public static void startLifeCycleActivity(Context context) {
        Intent intent = new Intent();
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        intent.setClass(context, LifeCycleActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        ButterKnife.bind(this);
        getLifecycle().addObserver(new MyObserver());
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }
}
