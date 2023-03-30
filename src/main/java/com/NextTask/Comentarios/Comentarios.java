package com.NextTask.Comentarios;

import com.NextTask.Tareas.Tareas;
import com.NextTask.Usuarios.Usuarios;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity(name="comentarios")
public class Comentarios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_comentario;

    private String contenido;

    private Date fecha;

    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuarios id_usuario;


    @ManyToOne
    @JoinColumn(name="id_tarea")
    private Tareas id_tarea;


    public Comentarios() {
    }

    public Comentarios(Integer id_comentario, String contenido, Date fecha, Usuarios id_usuario, Tareas id_tarea) {
        this.id_comentario = id_comentario;
        this.contenido = contenido;
        this.fecha = fecha;
        this.id_usuario = id_usuario;
        this.id_tarea = id_tarea;
    }

    public Integer getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(Integer id_comentario) {
        this.id_comentario = id_comentario;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuarios getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuarios id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Tareas getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(Tareas id_tarea) {
        this.id_tarea = id_tarea;
    }
}
