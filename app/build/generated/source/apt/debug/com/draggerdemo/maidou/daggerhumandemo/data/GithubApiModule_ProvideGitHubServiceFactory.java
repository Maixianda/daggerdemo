package com.draggerdemo.maidou.daggerhumandemo.data;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit.Retrofit;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GithubApiModule_ProvideGitHubServiceFactory implements Factory<GithubApiService> {
  private final GithubApiModule module;
  private final Provider<Retrofit> retrofitProvider;

  public GithubApiModule_ProvideGitHubServiceFactory(GithubApiModule module, Provider<Retrofit> retrofitProvider) {  
    assert module != null;
    this.module = module;
    assert retrofitProvider != null;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public GithubApiService get() {  
    GithubApiService provided = module.provideGitHubService(retrofitProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<GithubApiService> create(GithubApiModule module, Provider<Retrofit> retrofitProvider) {  
    return new GithubApiModule_ProvideGitHubServiceFactory(module, retrofitProvider);
  }
}

