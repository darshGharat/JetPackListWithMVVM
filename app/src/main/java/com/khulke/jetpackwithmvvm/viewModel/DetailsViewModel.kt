package com.khulke.jetpackwithmvvm.viewModel

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.khulke.jetpackwithmvvm.models.Twitts
import com.khulke.jetpackwithmvvm.repository.TwittRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * injects two parameter
 * repository: to get instance od TwittRepository
 * saveStateHandle: as we have used Navigation Controller and
 * on click of list item we are taking category name as a parameter
 * and navArguments saves all argument in SavedStateHandle
 */
@HiltViewModel
class DetailsViewModel @Inject constructor(
    private var repository: TwittRepository,
    private val saveStateHandle: SavedStateHandle
) : ViewModel() {

    val twitts: StateFlow<List<Twitts>>
        get() = repository.twitts

    init {
        viewModelScope.launch {
            val category = saveStateHandle.get<String>("category") ?: "android"
            Log.d("Selected Category", category)
            repository.getTwitts(category)
        }
    }

}