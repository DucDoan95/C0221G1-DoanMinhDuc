package com.example.security_login.model.repository;

import com.example.security_login.model.entity.AppRole;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRoleRepository extends PagingAndSortingRepository<AppRole,Long> {
}
