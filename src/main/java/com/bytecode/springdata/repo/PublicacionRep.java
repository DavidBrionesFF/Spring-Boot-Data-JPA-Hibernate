package com.bytecode.springdata.repo;

import com.bytecode.springdata.model.Publicacion;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicacionRep extends PagingAndSortingRepository<Publicacion, String> {
}
