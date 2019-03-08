package com.bytecode.springdata.repo.impl;

import com.bytecode.springdata.model.Usuario;
import com.bytecode.springdata.repo.UsuarioRepCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UsuarioRepImpl implements UsuarioRepCustom {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Usuario> findLikeNombre(String nombre) {
        return entityManager.createQuery("select u from Usuario u where u.nombre like %:nombre%", Usuario.class)
                .setParameter("nombre", nombre)
                .getResultList();
    }
}
