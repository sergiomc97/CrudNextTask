package com.NextTask.Comentarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/comentarios")
public class ComentariosController {

    @Autowired
    private ComentariosRepository repo;

    @GetMapping
    public List<Comentarios> getAll(){
        return repo.findAll();
    }
    @PostMapping
    public void insertar(@RequestBody Comentarios us){
        repo.save(us);
    }
    @PutMapping
    public void modificar(@RequestBody Comentarios us){
        repo.save(us);
    }
    @DeleteMapping
    public void eliminar(@PathVariable("id") Integer id){
        repo.deleteById(id);
    }
}
