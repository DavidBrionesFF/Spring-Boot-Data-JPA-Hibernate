package com.bytecode.springdata.repo;

import com.bytecode.springdata.model.Usuario;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface UsuarioRepCustom {
    public List<Usuario> findLikeNombre(String nombre);
}
