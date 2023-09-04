package com.example.addremove;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.addremove.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.widget.setBackground(R.color.teal_200);
        binding.widget.setCountSize(14);
//        binding.widget.setPlusSize(50, 50);
//        binding.widget.setMinusSize(50, 50);
    }
}