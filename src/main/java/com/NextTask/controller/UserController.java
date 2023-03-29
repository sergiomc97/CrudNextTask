package com.NextTask.controller;

import com.NextTask.entity.Usuarios;
import com.NextTask.interfaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserRepository repo;

    @GetMapping("/getAll")
    public List<Usuarios> getAll(){
        return repo.findAll();
    }
}
