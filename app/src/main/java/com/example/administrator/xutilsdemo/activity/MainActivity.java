package com.example.administrator.xutilsdemo.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.xutilsdemo.R;
import com.example.administrator.xutilsdemo.adapter.MyAdapter;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;
@ContentView(R.layout.activity_main)

public class MainActivity extends AppCompatActivity {
    @ViewInject(R.id.table)
TabLayout table;
    @ViewInject(R.id.viewPager)
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    x.view().inject(this);
      MyAdapter  mAdapter = new MyAdapter(getSupportFragmentManager());

        viewPager.setAdapter(mAdapter);
        table.setupWithViewPager(viewPager);

        table.setTabMode(TabLayout.MODE_FIXED);
        table.getTabAt(0).setText("a");
        table.getTabAt(1).setText("b");
        table.getTabAt(2).setText("c");
        table.getTabAt(3).setText("d");
        table.getTabAt(4).setText("e");



    }
}