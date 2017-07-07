package com.example.administrator.xutilsdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.xutilsdemo.R;

/**
 * l类描述
 * 创建人：黄礼钊
 * 时间：$data$ $time$
 */
public class NewsFragment extends Fragment {
    private TextView tv;
    private String mColor;

    public static NewsFragment newInstance(String mColor){
        NewsFragment fragment = new NewsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("tabs",mColor);

        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mColor = getArguments().getString("tabs");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ragment, container, false);
        tv = (TextView) view.findViewById(R.id.tv);
        tv.setText(mColor);

        /**这里注意是setBackgroundResource不是setBackgroundColor；setBackgroundResource(int resId)方法的参数是一个组件的id值。该方法也是用于加载组件的背景图片的；setBackgroundColor(Color.XXX)方法参数为一个Color类的静态常量.顾名思义,它是用来设置背景颜色的方法.*/

        return view;
    }
}
