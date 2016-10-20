package com.draggerdemo.maidou.daggerhumandemo.data;

import com.draggerdemo.maidou.daggerhumandemo.data.entity.Repo;

import java.util.ArrayList;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by Administrator on 2016/10/20.
 * 说明:
 * 创建人:         maixianda
 * 创建时间:       2016/10/20 10:56
 */

public interface GithubApiService {
    @GET("/users/{user}/repos")
    Observable<ArrayList<Repo>> getRepoData(@Path("user") String user);
}
