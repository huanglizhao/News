package com.example.administrator.xutilsdemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.administrator.xutilsdemo.fragment.NewsFragment;

/**
 * l类描述
 * 创建人：黄礼钊
 * 时间：$data$ $time$
 */
public class MyAdapter extends FragmentPagerAdapter {
    private String [] mColors = new String[]{"a","b","d","e","f"};
    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return NewsFragment.newInstance(mColors[position]);
    }

    @Override
    public int getCount() {
        return mColors.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "mColors" + (position + 1);
    }
}
