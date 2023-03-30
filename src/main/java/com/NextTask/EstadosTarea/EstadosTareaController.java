package com.NextTask.EstadosTarea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/estadosTarea")
public class EstadosTareaController {

    @Autowired
    private EstadosTareaRepository repo;

    @GetMapping
    public List<EstadosTarea> getAll(){
        return repo.findAll();
    }
    @PostMapping
    public void insertar(@RequestBody EstadosTarea us){
        repo.save(us);
    }
    @PutMapping
    public void modificar(@RequestBody EstadosTarea us){
        repo.save(us);
    }
    @DeleteMapping
    public void eliminar(@PathVariable("id") Integer id){
        repo.deleteById(id);
    }
}
