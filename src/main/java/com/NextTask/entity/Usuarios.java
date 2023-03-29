package com.NextTask.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name="usuarios")
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    @Column
    private String nick;
    @Column
    private String pass;
    @Column
    private String mail;
    @Column
    private int id_rol;

    public Usuarios() {
    }

    public Usuarios(int id_usuario, String nick, String pass, String mail, int id_rol) {
        this.id_usuario = id_usuario;
        this.nick = nick;
        this.pass = pass;
        this.mail = mail;
        this.id_rol = id_rol;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
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

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }
}
