package com.khulke.jetpackwithmvvm.viewModel;

import androidx.lifecycle.ViewModel;
import com.khulke.jetpackwithmvvm.repository.TwittRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

/**
 * injects TwittRepository
 * repository: to get instance od TwittRepository
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/khulke/jetpackwithmvvm/viewModel/CategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/khulke/jetpackwithmvvm/repository/TwittRepository;", "(Lcom/khulke/jetpackwithmvvm/repository/TwittRepository;)V", "categories", "Lkotlinx/coroutines/flow/StateFlow;", "", "", "getCategories", "()Lkotlinx/coroutines/flow/StateFlow;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class CategoryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.khulke.jetpackwithmvvm.repository.TwittRepository repository;
    
    @javax.inject.Inject
    public CategoryViewModel(@org.jetbrains.annotations.NotNull
    com.khulke.jetpackwithmvvm.repository.TwittRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> getCategories() {
        return null;
    }
}