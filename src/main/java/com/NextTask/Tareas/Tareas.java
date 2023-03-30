package com.NextTask.Tareas;

import com.NextTask.EstadosProyecto.EstadosProyecto;
import com.NextTask.EstadosTarea.EstadosTarea;
import com.NextTask.PrioridadesTarea.PrioridadesTarea;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity(name="tareas")
public class Tareas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tarea;

    private String nombre_tarea;

    private String desc_tarea;

    private Date fech_inicio;

    private Date fech_fin;

    @ManyToOne
    @JoinColumn(name = "id_prioridad_tarea")

    private PrioridadesTarea id_prioridad;

    @ManyToOne
    @JoinColumn(name = "id_estado_tarea")
    private EstadosTarea id_estado;

    @ManyToOne
    @JoinColumn(name = "id_proyecto")
    private EstadosProyecto id_proyecto;



    public Tareas() {
    }

    public Tareas(int id_tarea, String nombre_tarea, String desc_tarea, Date fech_inicio, Date fech_fin, PrioridadesTarea id_prioridad, EstadosTarea id_estado, EstadosProyecto id_proyecto) {
        this.id_tarea = id_tarea;
        this.nombre_tarea = nombre_tarea;
        this.desc_tarea = desc_tarea;
        this.fech_inicio = fech_inicio;
        this.fech_fin = fech_fin;
        this.id_prioridad = id_prioridad;
        this.id_estado = id_estado;
        this.id_proyecto = id_proyecto;
    }

    public int getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public String getNombre_tarea() {
        return nombre_tarea;
    }

    public void setNombre_tarea(String nombre_tarea) {
        this.nombre_tarea = nombre_tarea;
    }

    public String getDesc_tarea() {
        return desc_tarea;
    }

    public void setDesc_tarea(String desc_tarea) {
        this.desc_tarea = desc_tarea;
    }

    public Date getFech_inicio() {
        return fech_inicio;
    }

    public void setFech_inicio(Date fech_inicio) {
        this.fech_inicio = fech_inicio;
    }

    public Date getFech_fin() {
        return fech_fin;
    }

    public void setFech_fin(Date fech_fin) {
        this.fech_fin = fech_fin;
    }

    public PrioridadesTarea getId_prioridad() {
        return id_prioridad;
    }

    public void setId_prioridad(PrioridadesTarea id_prioridad) {
        this.id_prioridad = id_prioridad;
    }

    public EstadosTarea getId_estado() {
        return id_estado;
    }

    public void setId_estado(EstadosTarea id_estado) {
        this.id_estado = id_estado;
    }

    public EstadosProyecto getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(EstadosProyecto id_proyecto) {
        this.id_proyecto = id_proyecto;
    }
}
