package com.learning.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    // criando um metodo
    // que sera um endpoint
    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Teste", "teste@gmail.com", "9999999", "123122123");
        return ResponseEntity.ok().body(user);
    }
}
