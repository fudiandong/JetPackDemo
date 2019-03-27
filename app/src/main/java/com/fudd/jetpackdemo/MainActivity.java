package com.fudd.jetpackdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.fudd.jetpackdemo.lifecycle.LifeCycleActivity;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,R.id.btn6})
    public void toLifeCycle(View view) {

        switch (view.getId()){
            case R.id.btn1:
                Toast.makeText(MainActivity.this,"btn1",Toast.LENGTH_SHORT).show();
                LifeCycleActivity.startLifeCycleActivity(this);
                break;
            case R.id.btn2:
                Toast.makeText(MainActivity.this,"btn2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                Toast.makeText(MainActivity.this,"btn3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                Toast.makeText(MainActivity.this,"btn4",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn5:
                Toast.makeText(MainActivity.this,"btn5",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn6:
                Toast.makeText(MainActivity.this,"btn6",Toast.LENGTH_SHORT).show();
                break;
        }


    }




}
