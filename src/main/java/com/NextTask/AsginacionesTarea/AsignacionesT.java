package com.NextTask.AsginacionesTarea;

import com.NextTask.Tareas.Tareas;
import com.NextTask.Usuarios.Usuarios;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name="asignaciones_tarea")
public class AsignacionesT implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_as;

    @ManyToOne
    @JoinColumn(name="id_tarea")
    private Tareas id_tarea;

    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuarios id_usuario;

    public AsignacionesT() {
    }

    public AsignacionesT(Integer id_as, Tareas id_tarea, Usuarios id_usuario) {
        this.id_as = id_as;
        this.id_tarea = id_tarea;
        this.id_usuario = id_usuario;
    }

    public Integer getId_as() {
        return id_as;
    }

    public void setId_as(Integer id_as) {
        this.id_as = id_as;
    }

    public Tareas getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(Tareas id_tarea) {
        this.id_tarea = id_tarea;
    }

    public Usuarios getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuarios id_usuario) {
        this.id_usuario = id_usuario;
    }
}
