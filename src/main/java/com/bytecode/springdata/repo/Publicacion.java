package com.bytecode.springdata.repo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Pubicacion")
public class Publicacion {
    @Id
    @Column(name = "Id")
    private String id = UUID.randomUUID().toString().replace("-","");

    @Column(name = "Publicacion")
    private String publicacion;

    @Column(name = "FechaIntegracion")
    private Date fechaIntegracion = new Date();
}
