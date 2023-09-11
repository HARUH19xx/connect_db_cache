package com.example.connect_db_cache.repository

import org.springframework.data.jpa.repository.JpaRepository
import com.example.connect_db_cache.model.Post

interface PostRepository : JpaRepository<Post, Int> {
    fun findByUserId(userId: Int): List<Post>
}