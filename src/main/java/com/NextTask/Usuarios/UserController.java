package com.NextTask.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserRepository repo;

    @GetMapping
    public List<Usuarios> getAll(){
        return repo.findAll();
    }
    @PostMapping
    public void insertar(@RequestBody Usuarios us){
        repo.save(us);
    }
    @PutMapping
    public void modificar(@RequestBody Usuarios us){
        repo.save(us);
    }
    @DeleteMapping
    public void eliminar(@PathVariable("id") Integer id){
        repo.deleteById(id);
    }
}
