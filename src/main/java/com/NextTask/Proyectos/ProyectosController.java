package com.NextTask.Proyectos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/proyectos")
public class ProyectosController {

    @Autowired
    private ProyectosRepository repo;

    @GetMapping
    public List<Proyectos> getAll(){
        return repo.findAll();
    }
    @PostMapping
    public void insertar(@RequestBody Proyectos us){
        repo.save(us);
    }
    @PutMapping
    public void modificar(@RequestBody Proyectos us){
        repo.save(us);
    }
    @DeleteMapping
    public void eliminar(@PathVariable("id") Integer id){
        repo.deleteById(id);
    }
}
