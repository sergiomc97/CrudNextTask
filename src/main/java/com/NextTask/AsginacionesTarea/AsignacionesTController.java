package com.NextTask.AsginacionesTarea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/AsignacionesTareas")
public class AsignacionesTController {

    @Autowired
    private AsignacionesTRepository repo;

    @GetMapping
    public List<AsignacionesT> getAll(){
        return repo.findAll();
    }
    @PostMapping
    public void insertar(@RequestBody AsignacionesT us){
        repo.save(us);
    }
    @PutMapping
    public void modificar(@RequestBody AsignacionesT us){
        repo.save(us);
    }
    @DeleteMapping
    public void eliminar(@PathVariable("id") Integer id){
        repo.deleteById(id);
    }
}
