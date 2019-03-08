package com.bytecode.springdata.repo;

import com.bytecode.springdata.model.Nota;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRep extends PagingAndSortingRepository<Nota, String> {
}
