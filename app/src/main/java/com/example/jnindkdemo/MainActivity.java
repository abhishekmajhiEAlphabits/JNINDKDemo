package com.example.jnindkdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.jnindkdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.text.setText(getMessageFromNative());
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                binding.text.setText(getMsgFromJni());
            }
        },3000);


    }

    static {
        System.loadLibrary("jnindkdemo");
    }

    public native String getMsgFromJni();
    public native String getMessageFromNative();

}