package com.draggerdemo.maidou.daggerhumandemo.ui.activity;

import android.content.Intent;
import android.os.Bundle;

import com.draggerdemo.maidou.daggerhumandemo.R;
import com.draggerdemo.maidou.daggerhumandemo.utils.AppComponent;

import butterknife.OnClick;

/**
 * Created by Administrator on 2016/10/20.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/10/20 15:42
 */

public class MainActivity extends BaseActivity {
    @OnClick(R.id.showButton)
    public void onShowRepositoriesClick() {
        startActivity(new Intent(this, ReposListActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public int getLayoutId(){
        return R.layout.activity_main;
    }

    @Override
    public void setupActivityComponent(AppComponent appComponent){

    }
}
