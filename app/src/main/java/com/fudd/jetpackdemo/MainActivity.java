package com.fudd.jetpackdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.fudd.jetpackdemo.lifecycle.LifeCycleActivity;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn1)
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn1)
    public void toLifeCycle() {
        Toast.makeText(MainActivity.this,"btn1",Toast.LENGTH_SHORT).show();
        LifeCycleActivity.startLifeCycleActivity(this);
    }

}
