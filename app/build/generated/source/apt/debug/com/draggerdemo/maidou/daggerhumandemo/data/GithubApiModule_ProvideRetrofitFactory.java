package com.draggerdemo.maidou.daggerhumandemo.data;

import android.app.Application;
import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit.Retrofit;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GithubApiModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final GithubApiModule module;
  private final Provider<Application> applicationProvider;
  private final Provider<OkHttpClient> okHttpClientProvider;

  public GithubApiModule_ProvideRetrofitFactory(GithubApiModule module, Provider<Application> applicationProvider, Provider<OkHttpClient> okHttpClientProvider) {  
    assert module != null;
    this.module = module;
    assert applicationProvider != null;
    this.applicationProvider = applicationProvider;
    assert okHttpClientProvider != null;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {  
    Retrofit provided = module.provideRetrofit(applicationProvider.get(), okHttpClientProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Retrofit> create(GithubApiModule module, Provider<Application> applicationProvider, Provider<OkHttpClient> okHttpClientProvider) {  
    return new GithubApiModule_ProvideRetrofitFactory(module, applicationProvider, okHttpClientProvider);
  }
}

