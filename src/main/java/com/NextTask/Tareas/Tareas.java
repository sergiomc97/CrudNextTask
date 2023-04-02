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

    private String descripcion_tarea;

    private Date fecha_inicio_tarea;

    private Date fecha_fin_tarea;

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

    public Tareas(int id_tarea, String nombre_tarea, String descripcion_tarea, Date fecha_inicio_tarea, Date fecha_fin_tarea, PrioridadesTarea id_prioridad, EstadosTarea id_estado, EstadosProyecto id_proyecto) {
        this.id_tarea = id_tarea;
        this.nombre_tarea = nombre_tarea;
        this.descripcion_tarea = descripcion_tarea;
        this.fecha_inicio_tarea = fecha_inicio_tarea;
        this.fecha_fin_tarea = fecha_fin_tarea;
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

    public String getDescripcion_tarea() {
        return descripcion_tarea;
    }

    public void setDescripcion_tarea(String descripcion_tarea) {
        this.descripcion_tarea = descripcion_tarea;
    }

    public Date getFecha_inicio_tarea() {
        return fecha_inicio_tarea;
    }

    public void setFecha_inicio_tarea(Date fecha_inicio_tarea) {
        this.fecha_inicio_tarea = fecha_inicio_tarea;
    }

    public Date getFecha_fin_tarea() {
        return fecha_fin_tarea;
    }

    public void setFecha_fin_tarea(Date fecha_fin_tarea) {
        this.fecha_fin_tarea = fecha_fin_tarea;
    }
}
