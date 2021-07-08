package com.example.furama_resort.model.repository.login;

import com.example.furama_resort.model.login.AppRole;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRoleRepository extends PagingAndSortingRepository<AppRole,Long> {
}
