package com.NextTask.Usuarios;

import com.NextTask.Roles.Roles;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name="usuarios")
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;
    @Column
    private String nick;
    @Column
    private String pass;
    @Column
    private String mail;

    @ManyToOne
    @JoinColumn(name="id_rol")
    private Roles id_rol;

    public Usuarios() {
    }

    public Usuarios(Integer id_usuario, String nick, String pass, String mail, Roles id_rol) {
        this.id_usuario = id_usuario;
        this.nick = nick;
        this.pass = pass;
        this.mail = mail;
        this.id_rol = id_rol;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Roles getId_rol() {
        return id_rol;
    }

    public void setId_rol(Roles id_rol) {
        this.id_rol = id_rol;
    }
}
