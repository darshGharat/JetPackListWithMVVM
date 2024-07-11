package com.khulke.jetpackwithmvvm;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = TweetsApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface TweetsApplication_GeneratedInjector {
  void injectTweetsApplication(TweetsApplication tweetsApplication);
}
