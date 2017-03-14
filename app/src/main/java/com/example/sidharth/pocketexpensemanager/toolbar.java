package com.example.sidharth.pocketexpensemanager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;


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
        viewPagerAdapter.addFragments(new homeFragment(),"Home");
        viewPagerAdapter.addFragments(new pay(),"Pay");
        viewPagerAdapter.addFragments(new expense(),"Expense");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    public void Date(View view) {
        DateDialogFragment dialog = new DateDialogFragment();
        android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
        dialog.show(ft, "asd");
    }


}
