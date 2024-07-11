package com.khulke.jetpackwithmvvm.viewModel;

import android.util.Log;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.khulke.jetpackwithmvvm.models.Twitts;
import com.khulke.jetpackwithmvvm.repository.TwittRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

/**
 * injects two parameter
 * repository: to get instance od TwittRepository
 * saveStateHandle: as we have used Navigation Controller and
 * on click of list item we are taking category name as a parameter
 * and navArguments saves all argument in SavedStateHandle
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/khulke/jetpackwithmvvm/viewModel/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/khulke/jetpackwithmvvm/repository/TwittRepository;", "saveStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/khulke/jetpackwithmvvm/repository/TwittRepository;Landroidx/lifecycle/SavedStateHandle;)V", "twitts", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/khulke/jetpackwithmvvm/models/Twitts;", "getTwitts", "()Lkotlinx/coroutines/flow/StateFlow;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class DetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.khulke.jetpackwithmvvm.repository.TwittRepository repository;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.SavedStateHandle saveStateHandle = null;
    
    @javax.inject.Inject
    public DetailsViewModel(@org.jetbrains.annotations.NotNull
    com.khulke.jetpackwithmvvm.repository.TwittRepository repository, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle saveStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.khulke.jetpackwithmvvm.models.Twitts>> getTwitts() {
        return null;
    }
}