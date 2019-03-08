package com.bytecode.springdata.repo;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @Column(name = "Id")
    private String id = UUID.randomUUID().toString().replace("-","");

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Contrasena")
    private String contrasena;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "FechaIntegracion")
    private Date fechaIntegracion = new Date();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Role.class, mappedBy = "usuarios")
    private Set<Role> roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaIntegracion() {
        return fechaIntegracion;
    }

    public void setFechaIntegracion(Date fechaIntegracion) {
        this.fechaIntegracion = fechaIntegracion;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
