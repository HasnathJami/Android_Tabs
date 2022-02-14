package com.example.android_tabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.FragmentManager;


public class MainActivity extends AppCompatActivity {

    ViewPager vp;
    TabLayout tl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp=findViewById(R.id.viewPagerId);
        tl=findViewById(R.id.tabLayoutId);


        //Naive approach
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentAdapter fa=new FragmentAdapter(fragmentManager);
        vp.setAdapter(fa);

        //Efficent approach Line 32
        //vp.setAdapter(new FragmentAdapter(getSupportFragmentManager());
        tl.setupWithViewPager(vp);
    }
}