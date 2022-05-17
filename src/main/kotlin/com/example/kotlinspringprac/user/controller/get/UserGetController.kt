package com.example.kotlinspringprac.user.controller.get

import com.example.kotlinspringprac.user.service.UserService
import com.example.kotlinspringprac.user.model.User
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserGetController(
    private val userService: UserService
) {

    // 모든 user 리스트
    @GetMapping()
    fun getAllUsers(): ResponseEntity<ArrayList<User>> {
        return ResponseEntity(userService.getAllUserList(), HttpStatus.OK)
    }

    // id에 맞는 한명의 user
    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: String): ResponseEntity<User> {
        return ResponseEntity(userService.getUserById(id.toInt()), HttpStatus.OK)
    }
}