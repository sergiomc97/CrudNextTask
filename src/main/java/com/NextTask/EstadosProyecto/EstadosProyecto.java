package com.NextTask.EstadosProyecto;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name="estados_proyecto")
public class EstadosProyecto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_estadoProyecto;

    private String nombre_estado;


    public EstadosProyecto() {
    }

    public EstadosProyecto(Integer id_estadoProyecto, String nombre_estado) {
        this.id_estadoProyecto = id_estadoProyecto;
        this.nombre_estado = nombre_estado;
    }

    public Integer getId_estadoProyecto() {
        return id_estadoProyecto;
    }

    public void setId_estadoProyecto(Integer id_estadoProyecto) {
        this.id_estadoProyecto = id_estadoProyecto;
    }

    public String getNombre_estado() {
        return nombre_estado;
    }

    public void setNombre_estado(String nombre_estado) {
        this.nombre_estado = nombre_estado;
    }
}
