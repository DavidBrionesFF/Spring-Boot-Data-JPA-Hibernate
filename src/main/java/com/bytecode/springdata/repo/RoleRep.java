package com.bytecode.springdata.repo;

import com.bytecode.springdata.model.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRep extends PagingAndSortingRepository<Role, String> {
}
