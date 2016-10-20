package com.draggerdemo.maidou.daggerhumandemo.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.draggerdemo.maidou.daggerhumandemo.utils.AppApplication;
import com.draggerdemo.maidou.daggerhumandemo.utils.AppComponent;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/10/20.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/10/20 11:05
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        setupActivityComponent(AppApplication.getsInstance().getAppComponent());
    }

    protected abstract void setupActivityComponent(AppComponent appComponent);
    protected abstract int getLayoutId();
}
