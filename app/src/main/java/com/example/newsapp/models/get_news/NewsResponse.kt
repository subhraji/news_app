package com.example.newsapp.models.get_news


data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)