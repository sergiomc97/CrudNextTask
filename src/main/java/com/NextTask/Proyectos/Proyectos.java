package com.NextTask.Proyectos;

import com.NextTask.EstadosProyecto.EstadosProyecto;
import jakarta.persistence.*;

import java.io.DataInputStream;
import java.io.Serializable;
import java.util.Date;

@Entity(name="proyectos")
public class Proyectos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_proyecto;

    private String nombre_proyecto;
    private String descripcion_proyecto;
    private Date fecha_inicio;
    private Date fecha_fin;

    @ManyToOne
    @JoinColumn(name = "id_estado_proyecto")
    private EstadosProyecto estado_proyecto;

    public Proyectos() {
    }

    public Proyectos(Integer id_proyecto, String nombre_proyecto, String descripcion_proyecto, Date fecha_inicio, Date fecha_fin, EstadosProyecto estado_proyecto) {
        this.id_proyecto = id_proyecto;
        this.nombre_proyecto = nombre_proyecto;
        this.descripcion_proyecto = descripcion_proyecto;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.estado_proyecto = estado_proyecto;
    }

    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public String getDescripcion_proyecto() {
        return descripcion_proyecto;
    }

    public void setDescripcion_proyecto(String descripcion_proyecto) {
        this.descripcion_proyecto = descripcion_proyecto;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public EstadosProyecto getEstado_proyecto() {
        return estado_proyecto;
    }

    public void setEstado_proyecto(EstadosProyecto estado_proyecto) {
        this.estado_proyecto = estado_proyecto;
    }
}
