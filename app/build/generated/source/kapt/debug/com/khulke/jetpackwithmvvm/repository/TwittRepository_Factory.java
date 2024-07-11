// Generated by Dagger (https://dagger.dev).
package com.khulke.jetpackwithmvvm.repository;

import com.khulke.jetpackwithmvvm.api.ApiCalls;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class TwittRepository_Factory implements Factory<TwittRepository> {
  private final Provider<ApiCalls> apisProvider;

  public TwittRepository_Factory(Provider<ApiCalls> apisProvider) {
    this.apisProvider = apisProvider;
  }

  @Override
  public TwittRepository get() {
    return newInstance(apisProvider.get());
  }

  public static TwittRepository_Factory create(Provider<ApiCalls> apisProvider) {
    return new TwittRepository_Factory(apisProvider);
  }

  public static TwittRepository newInstance(ApiCalls apis) {
    return new TwittRepository(apis);
  }
}
