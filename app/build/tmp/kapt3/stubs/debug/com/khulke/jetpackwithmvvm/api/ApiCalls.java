package com.khulke.jetpackwithmvvm.api;

import com.khulke.jetpackwithmvvm.models.Twitts;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/khulke/jetpackwithmvvm/api/ApiCalls;", "", "getCategories", "Lretrofit2/Response;", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTweets", "Lcom/khulke/jetpackwithmvvm/models/Twitts;", "category", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiCalls {
    
    @retrofit2.http.GET(value = "/v3/b/668d18c8e41b4d34e40f535e?meta=false")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTweets(@retrofit2.http.Header(value = "X-JSON-Path")
    @org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.khulke.jetpackwithmvvm.models.Twitts>>> $completion);
    
    @retrofit2.http.GET(value = "/v3/b/668d18c8e41b4d34e40f535e?meta=false")
    @retrofit2.http.Headers(value = {"X-JSON-Path: twitts..category"})
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCategories(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<java.lang.String>>> $completion);
}