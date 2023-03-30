package com.NextTask.PrioridadesTarea;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name="prioridades_tarea")
public class PrioridadesTarea implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_prioridadTarea;

    private String nombre_prioridad;

    public PrioridadesTarea() {
    }

    public PrioridadesTarea(Integer id_prioridadTarea, String nombre_prioridad) {
        this.id_prioridadTarea = id_prioridadTarea;
        this.nombre_prioridad = nombre_prioridad;
    }

    public Integer getId_prioridadTarea() {
        return id_prioridadTarea;
    }

    public void setId_prioridadTarea(Integer id_prioridadTarea) {
        this.id_prioridadTarea = id_prioridadTarea;
    }

    public String getNombre_prioridad() {
        return nombre_prioridad;
    }

    public void setNombre_prioridad(String nombre_prioridad) {
        this.nombre_prioridad = nombre_prioridad;
    }
}
