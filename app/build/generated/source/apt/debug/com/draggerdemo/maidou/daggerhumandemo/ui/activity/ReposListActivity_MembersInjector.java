package com.draggerdemo.maidou.daggerhumandemo.ui.activity;

import com.draggerdemo.maidou.daggerhumandemo.data.GithubApiService;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ReposListActivity_MembersInjector implements MembersInjector<ReposListActivity> {
  private final MembersInjector<BaseActivity> supertypeInjector;
  private final Provider<GithubApiService> githubApiServiceProvider;

  public ReposListActivity_MembersInjector(MembersInjector<BaseActivity> supertypeInjector, Provider<GithubApiService> githubApiServiceProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert githubApiServiceProvider != null;
    this.githubApiServiceProvider = githubApiServiceProvider;
  }

  @Override
  public void injectMembers(ReposListActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.githubApiService = githubApiServiceProvider.get();
  }

  public static MembersInjector<ReposListActivity> create(MembersInjector<BaseActivity> supertypeInjector, Provider<GithubApiService> githubApiServiceProvider) {  
      return new ReposListActivity_MembersInjector(supertypeInjector, githubApiServiceProvider);
  }
}

