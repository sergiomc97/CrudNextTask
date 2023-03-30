package com.NextTask.EstadosTarea;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name="estados_tarea")
public class EstadosTarea implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_estadoTarea;

    private String nombre_estado;

    public EstadosTarea() {
    }

    public EstadosTarea(Integer id_estadoTarea, String nombre_estado) {
        this.id_estadoTarea = id_estadoTarea;
        this.nombre_estado = nombre_estado;
    }

    public Integer getId_estadoTarea() {
        return id_estadoTarea;
    }

    public void setId_estadoTarea(Integer id_estadoTarea) {
        this.id_estadoTarea = id_estadoTarea;
    }

    public String getNombre_estado() {
        return nombre_estado;
    }

    public void setNombre_estado(String nombre_estado) {
        this.nombre_estado = nombre_estado;
    }
}
