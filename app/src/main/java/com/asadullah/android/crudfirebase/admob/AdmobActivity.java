package com.asadullah.android.crudfirebase.admob;

import android.os.Bundle;
import android.view.View;

import com.asadullah.android.crudfirebase.R;
import com.asadullah.android.crudfirebase.helper.MyFuction;

public class AdmobActivity extends MyFuction{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admob);
    }

    public void onbanner(View view) {
        myIntent (BannerActivity.class);
    }

    public void oninterstitial(View view) {
        myIntent (IntersitialActivity.class);
    }

    public void onreward(View view) {
        myIntent(RewardVideoActivity.class);
    }
}