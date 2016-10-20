package com.draggerdemo.maidou.daggerhumandemo.utils;

import com.draggerdemo.maidou.daggerhumandemo.data.GithubApiModule;
import com.draggerdemo.maidou.daggerhumandemo.data.GithubApiService;
import com.draggerdemo.maidou.daggerhumandemo.ui.activity.ReposListActivity;

import dagger.Component;

/**
 * Created by Administrator on 2016/10/20.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/10/20 10:17
 */
@Component(modules = {AppModule.class,GithubApiModule.class})
public interface AppComponent {
    void inject(ReposListActivity activity);
}
