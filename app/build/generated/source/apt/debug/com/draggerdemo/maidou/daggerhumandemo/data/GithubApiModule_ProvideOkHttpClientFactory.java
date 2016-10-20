package com.draggerdemo.maidou.daggerhumandemo.data;

import com.squareup.okhttp.OkHttpClient;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GithubApiModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final GithubApiModule module;

  public GithubApiModule_ProvideOkHttpClientFactory(GithubApiModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public OkHttpClient get() {  
    OkHttpClient provided = module.provideOkHttpClient();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<OkHttpClient> create(GithubApiModule module) {  
    return new GithubApiModule_ProvideOkHttpClientFactory(module);
  }
}

