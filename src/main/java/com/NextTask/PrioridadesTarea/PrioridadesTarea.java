package com.NextTask.PrioridadesTarea;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name="prioridades_tarea")
public class PrioridadesTarea implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_prioridad_tarea;

    private String nombre_prioridad_tarea;

    public PrioridadesTarea() {
    }

    public PrioridadesTarea(Integer id_prioridadTarea, String nombre_prioridad) {
        this.id_prioridad_tarea = id_prioridadTarea;
        this.nombre_prioridad_tarea = nombre_prioridad;
    }

    public Integer getId_prioridadTarea() {
        return id_prioridad_tarea;
    }

    public void setId_prioridadTarea(Integer id_prioridadTarea) {
        this.id_prioridad_tarea = id_prioridadTarea;
    }

    public String getNombre_prioridad() {
        return nombre_prioridad_tarea;
    }

    public void setNombre_prioridad(String nombre_prioridad) {
        this.nombre_prioridad_tarea = nombre_prioridad;
    }
}
