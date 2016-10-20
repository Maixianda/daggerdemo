package com.draggerdemo.maidou.daggerhumandemo.utils;

import android.app.Application;

import com.draggerdemo.maidou.daggerhumandemo.data.GithubApiModule;

/**
 * Created by Administrator on 2016/10/20.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/10/20 10:12
 */

public class AppApplication extends Application{
    private static AppApplication sInstance;
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        setupCompoent();
    }

    private void setupCompoent() {
        appComponent = DaggerAppComponent
                .builder()
                .githubApiModule(new GithubApiModule())
                .appModule(new AppModule(this))
                .build();
    }

    public static AppApplication getsInstance()
    {
        return sInstance;
    }

    public AppComponent getAppComponent()
    {
        return appComponent;
    }
}
