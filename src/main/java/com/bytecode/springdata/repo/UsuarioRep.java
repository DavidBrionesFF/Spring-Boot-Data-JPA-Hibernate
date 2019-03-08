package com.bytecode.springdata.repo;

import com.bytecode.springdata.model.Usuario;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRep extends PagingAndSortingRepository<Usuario, String> {
}
