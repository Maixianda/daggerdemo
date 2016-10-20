package com.draggerdemo.maidou.daggerhumandemo.utils;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/10/20.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/10/20 10:23
 */
@Module
public class AppModule {
    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    public Application proviceApplication()
    {
        return application;
    }
}
