package com.example.connect_db_cache.repository

import org.springframework.data.jpa.repository.JpaRepository
import com.example.connect_db_cache.model.User

interface UserRepository : JpaRepository<User, Int> {
    fun findByName(name: String): User?
}
