package com.NextTask.Tareas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/tareas")
public class TareasController {

    @Autowired
    private TareasRepository repo;

    @GetMapping
    public List<Tareas> getAll(){
        return repo.findAll();
    }
    @PostMapping
    public void insertar(@RequestBody Tareas us){
        repo.save(us);
    }
    @PutMapping
    public void modificar(@RequestBody Tareas us){
        repo.save(us);
    }
    @DeleteMapping
    public void eliminar(@PathVariable("id") Integer id){
        repo.deleteById(id);
    }
}
