package com.mredrock.freshmanspecial.strategy.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.mredrock.freshmanspecial.R;
import com.mredrock.freshmanspecial.strategy.adapter.StrategyViewPagerAdapter;
import com.mredrock.freshmanspecial.strategy.utils.StatusUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 *  Created by Grantsome on 2017/8/3.
 */
public class StrategyActivity extends AppCompatActivity {

    private StrategyViewPagerAdapter mAdapter;

    @BindView(R.id.view_pager)
    ViewPager mViewPager;

    @BindView(R.id.tab_layout)
    TabLayout mTabLayout;

    @BindView(R.id.toolbar_iv_left)
    ImageView mImageView;

    @BindView(R.id.spilt_line)
    View mSpiltLine;

    @OnClick(R.id.toolbar_iv_left)
    public void ClickOnToolbarIvLeft(){
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.special_2017_activity_strategy);
        ButterKnife.bind(this);
        initData();
        StatusUtils.changeStatus(this);
    }

    private void initData(){
        mAdapter = new StrategyViewPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mViewPager.setCurrentItem(0);
        mTabLayout.setupWithViewPager(mViewPager,true);
    }


}
