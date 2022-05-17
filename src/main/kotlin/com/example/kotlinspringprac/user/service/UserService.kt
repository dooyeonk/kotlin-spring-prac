package com.example.kotlinspringprac.user.service

import com.example.kotlinspringprac.user.model.User
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class UserService {
    private val userList = arrayListOf<User>(
        User(1, "danny", 28, "danny.kang@kakaostyle.com"),
        User(2, "cherry", 26, "cherry.blossom@kakaostyle.com"),
        User(3, "shine", 30, "shine.kim@kakaostyle.com"),
    )
    fun getAllUserList(): ArrayList<User> {
        return userList
    }

    fun getUserById(userId: Int): User? {
        return userList.find { it.id === userId }
    }
}