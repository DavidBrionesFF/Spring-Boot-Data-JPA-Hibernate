package com.bytecode.springdata.repo;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Role")
public class Role {
    @Id
    @Column(name = "Id")
    private String id = UUID.randomUUID().toString().replace("-","");

    @Column(name = "Nombre")
    private String nombre;

    @ManyToMany(targetEntity = Usuario.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Usuario> usuarios;

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

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
