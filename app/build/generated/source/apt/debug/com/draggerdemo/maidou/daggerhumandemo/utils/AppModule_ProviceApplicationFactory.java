package com.draggerdemo.maidou.daggerhumandemo.utils;

import android.app.Application;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AppModule_ProviceApplicationFactory implements Factory<Application> {
  private final AppModule module;

  public AppModule_ProviceApplicationFactory(AppModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Application get() {  
    Application provided = module.proviceApplication();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Application> create(AppModule module) {  
    return new AppModule_ProviceApplicationFactory(module);
  }
}

