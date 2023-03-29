package com.NextTask.Roles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/roles")
public class RolesController {

    @Autowired
    private RolesRepository repo;

    @GetMapping
    public List<Roles> getAll(){
        return repo.findAll();
    }
    @PostMapping
    public void insertar(@RequestBody Roles us){
        repo.save(us);
    }
    @PutMapping
    public void modificar(@RequestBody Roles us){
        repo.save(us);
    }
    @DeleteMapping
    public void eliminar(@PathVariable("id") Integer id){
        repo.deleteById(id);
    }
}
