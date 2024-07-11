package com.khulke.jetpackwithmvvm.repository;

import com.khulke.jetpackwithmvvm.api.ApiCalls;
import com.khulke.jetpackwithmvvm.models.Twitts;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/khulke/jetpackwithmvvm/repository/TwittRepository;", "", "apis", "Lcom/khulke/jetpackwithmvvm/api/ApiCalls;", "(Lcom/khulke/jetpackwithmvvm/api/ApiCalls;)V", "_categories", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "_twitts", "Lcom/khulke/jetpackwithmvvm/models/Twitts;", "category", "Lkotlinx/coroutines/flow/StateFlow;", "getCategory", "()Lkotlinx/coroutines/flow/StateFlow;", "twitts", "getTwitts", "getCategories", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TwittRepository {
    @org.jetbrains.annotations.NotNull
    private final com.khulke.jetpackwithmvvm.api.ApiCalls apis = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> _categories;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.khulke.jetpackwithmvvm.models.Twitts>> _twitts;
    
    @javax.inject.Inject
    public TwittRepository(@org.jetbrains.annotations.NotNull
    com.khulke.jetpackwithmvvm.api.ApiCalls apis) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCategories(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.khulke.jetpackwithmvvm.models.Twitts>> getTwitts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getTwitts(@org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}