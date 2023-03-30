package com.NextTask.PrioridadesTarea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/prioridadesTarea")
public class PrioridadesTareaController {

    @Autowired
    private PrioridadesTareaRepository repo;

    @GetMapping
    public List<PrioridadesTarea> getAll(){
        return repo.findAll();
    }
    @PostMapping
    public void insertar(@RequestBody PrioridadesTarea us){
        repo.save(us);
    }
    @PutMapping
    public void modificar(@RequestBody PrioridadesTarea us){
        repo.save(us);
    }
    @DeleteMapping
    public void eliminar(@PathVariable("id") Integer id){
        repo.deleteById(id);
    }
}
