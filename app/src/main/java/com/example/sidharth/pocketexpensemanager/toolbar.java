package com.example.sidharth.pocketexpensemanager;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by Sidharth on 3/5/2017.
 */

public class toolbar extends AppCompatActivity{
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    viewPagerAdapter viewPagerAdapter;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tabLayout=(TabLayout)findViewById(R.id.tablayout);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        viewPagerAdapter=new viewPagerAdapter(getSupportFragmentManager());
       viewPagerAdapter.addFragments(new HomeFragment(),"Home");
        viewPagerAdapter.addFragments(new topfree(),"Pay");
        viewPagerAdapter.addFragments(new toppaid(),"Expense");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

}
