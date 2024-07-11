package com.khulke.jetpackwithmvvm.repository

import com.khulke.jetpackwithmvvm.api.ApiCalls
import com.khulke.jetpackwithmvvm.models.Twitts
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class TwittRepository @Inject constructor(private val apis: ApiCalls) {

    private var _categories = MutableStateFlow<List<String>>(emptyList())
    val category: StateFlow<List<String>>
        get() = _categories

    suspend fun getCategories() {
        val response = apis.getCategories()
        if (response.isSuccessful && response.body() != null) {
            response.body()?.distinct()?.let { _categories.emit(it) }
        }
    }

    private var _twitts = MutableStateFlow<List<Twitts>>(emptyList())
    val twitts: StateFlow<List<Twitts>>
        get() = _twitts

    suspend fun getTwitts(category: String) {
        val response = apis.getTweets("twitts[?(@.category == \"$category\")]")
        if (response.isSuccessful && response.body() != null) {
            response.body()?.let { _twitts.emit(it) }
        }
    }
}