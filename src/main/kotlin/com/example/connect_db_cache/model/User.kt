package com.example.connect_db_cache.model

import java.sql.Date
import java.sql.Timestamp
import jakarta.persistence.*

@Entity
@Table(name = "user")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    @Column(nullable = false, unique = true)
    val name: String,

    @Column
    val profile: String? = null,

    @Column(name = "date_of_birth")
    val dateOfBirth: Date? = null,

    @Column(nullable = false)
    val password: String,

    @Column(name = "created_at")
    val createdAt: Timestamp? = null,

    @Column(name = "updated_at")
    val updatedAt: Timestamp? = null,

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val posts: List<Post> = mutableListOf()
)
