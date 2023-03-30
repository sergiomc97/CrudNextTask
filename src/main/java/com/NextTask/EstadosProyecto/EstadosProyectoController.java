package com.NextTask.EstadosProyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/estadosProyecto")
public class EstadosProyectoController {

    @Autowired
    private EstadosProyectoRepository repo;

    @GetMapping
    public List<EstadosProyecto> getAll(){
        return repo.findAll();
    }
    @PostMapping
    public void insertar(@RequestBody EstadosProyecto us){
        repo.save(us);
    }
    @PutMapping
    public void modificar(@RequestBody EstadosProyecto us){
        repo.save(us);
    }
    @DeleteMapping
    public void eliminar(@PathVariable("id") Integer id){
        repo.deleteById(id);
    }
}
