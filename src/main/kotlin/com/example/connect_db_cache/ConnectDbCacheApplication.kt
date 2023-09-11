package com.example.connect_db_cache

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class ConnectDbCacheApplication

fun main(args: Array<String>) {
	runApplication<ConnectDbCacheApplication>(*args)
}
