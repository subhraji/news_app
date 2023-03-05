package com.example.newsapp.models.get_news


data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)