package com.bytecode.springdata.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Configuracion")
public class Configuracion {
    @Id
    @Column(name = "Id")
    private String id = UUID.randomUUID().toString().replace("-","");

    @Column(name = "Parametro")
    private String parametro;

    @Column(name = "Valor")
    private String valor;

    @OneToOne(targetEntity = Usuario.class, mappedBy = "configuracion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario")
    private Usuario usuario;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
