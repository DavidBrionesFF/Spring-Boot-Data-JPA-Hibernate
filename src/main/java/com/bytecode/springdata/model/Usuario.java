package com.bytecode.springdata.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.*;

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

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Role.class, mappedBy = "usuarios")
    private Set<Role> roles = new HashSet<>();

    @Fetch(value = FetchMode.SUBSELECT)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuario", targetEntity = Publicacion.class)
    private List<Publicacion> publicaciones ;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Configuracion.class)
    private Configuracion configuracion;

    @Fetch(value = FetchMode.SUBSELECT)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Nota.class, mappedBy = "usuario")
    private List<Nota> notas ;

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

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public Configuracion getConfiguracion() {
        return configuracion;
    }

    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaIntegracion=" + fechaIntegracion +
                ", roles=" + roles +
                ", publicaciones=" + publicaciones +
                ", configuracion=" + configuracion +
                ", notas=" + notas +
                '}';
    }
}
