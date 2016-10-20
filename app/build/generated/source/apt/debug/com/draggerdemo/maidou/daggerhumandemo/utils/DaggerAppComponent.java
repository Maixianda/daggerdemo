package com.draggerdemo.maidou.daggerhumandemo.utils;

import android.app.Application;
import com.draggerdemo.maidou.daggerhumandemo.data.GithubApiModule;
import com.draggerdemo.maidou.daggerhumandemo.data.GithubApiModule_ProvideGitHubServiceFactory;
import com.draggerdemo.maidou.daggerhumandemo.data.GithubApiModule_ProvideOkHttpClientFactory;
import com.draggerdemo.maidou.daggerhumandemo.data.GithubApiModule_ProvideRetrofitFactory;
import com.draggerdemo.maidou.daggerhumandemo.data.GithubApiService;
import com.draggerdemo.maidou.daggerhumandemo.ui.activity.ReposListActivity;
import com.draggerdemo.maidou.daggerhumandemo.ui.activity.ReposListActivity_MembersInjector;
import com.squareup.okhttp.OkHttpClient;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit.Retrofit;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerAppComponent implements AppComponent {
  private Provider<Application> proviceApplicationProvider;
  private Provider<OkHttpClient> provideOkHttpClientProvider;
  private Provider<Retrofit> provideRetrofitProvider;
  private Provider<GithubApiService> provideGitHubServiceProvider;
  private MembersInjector<ReposListActivity> reposListActivityMembersInjector;

  private DaggerAppComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.proviceApplicationProvider = AppModule_ProviceApplicationFactory.create(builder.appModule);
    this.provideOkHttpClientProvider = GithubApiModule_ProvideOkHttpClientFactory.create(builder.githubApiModule);
    this.provideRetrofitProvider = GithubApiModule_ProvideRetrofitFactory.create(builder.githubApiModule, proviceApplicationProvider, provideOkHttpClientProvider);
    this.provideGitHubServiceProvider = GithubApiModule_ProvideGitHubServiceFactory.create(builder.githubApiModule, provideRetrofitProvider);
    this.reposListActivityMembersInjector = ReposListActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideGitHubServiceProvider);
  }

  @Override
  public void inject(ReposListActivity activity) {  
    reposListActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private AppModule appModule;
    private GithubApiModule githubApiModule;
  
    private Builder() {  
    }
  
    public AppComponent build() {  
      if (appModule == null) {
        throw new IllegalStateException("appModule must be set");
      }
      if (githubApiModule == null) {
        this.githubApiModule = new GithubApiModule();
      }
      return new DaggerAppComponent(this);
    }
  
    public Builder appModule(AppModule appModule) {  
      if (appModule == null) {
        throw new NullPointerException("appModule");
      }
      this.appModule = appModule;
      return this;
    }
  
    public Builder githubApiModule(GithubApiModule githubApiModule) {  
      if (githubApiModule == null) {
        throw new NullPointerException("githubApiModule");
      }
      this.githubApiModule = githubApiModule;
      return this;
    }
  }
}

