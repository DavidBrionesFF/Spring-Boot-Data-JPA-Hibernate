package com.bytecode.springdata.repo;

import com.bytecode.springdata.model.Configuracion;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfiguracionRep extends PagingAndSortingRepository<Configuracion, String> {
}
