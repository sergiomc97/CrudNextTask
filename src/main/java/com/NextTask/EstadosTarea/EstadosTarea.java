package com.NextTask.EstadosTarea;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name="estados_tarea")
public class EstadosTarea implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_estado_tarea;

    private String nombre_estado_tarea;

    public EstadosTarea() {
    }

    public EstadosTarea(Integer id_estadoTarea, String nombre_estado) {
        this.id_estado_tarea = id_estadoTarea;
        this.nombre_estado_tarea = nombre_estado;
    }

    public Integer getId_estadoTarea() {
        return id_estado_tarea;
    }

    public void setId_estadoTarea(Integer id_estadoTarea) {
        this.id_estado_tarea = id_estadoTarea;
    }

    public String getNombre_estado() {
        return nombre_estado_tarea;
    }

    public void setNombre_estado(String nombre_estado) {
        this.nombre_estado_tarea = nombre_estado;
    }
}
