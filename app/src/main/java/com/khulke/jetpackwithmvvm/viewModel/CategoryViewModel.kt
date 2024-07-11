package com.khulke.jetpackwithmvvm.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.khulke.jetpackwithmvvm.repository.TwittRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * injects TwittRepository
 * repository: to get instance od TwittRepository
 */
@HiltViewModel
class CategoryViewModel @Inject constructor(private var repository: TwittRepository) : ViewModel() {

    val categories: StateFlow<List<String>>
        get() = repository.category

    init {
        viewModelScope.launch {
            repository.getCategories()
        }
    }

}