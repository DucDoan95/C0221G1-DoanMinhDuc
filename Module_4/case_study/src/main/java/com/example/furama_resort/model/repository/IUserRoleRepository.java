package com.example.furama_resort.model.repository;

import com.example.furama_resort.model.login.UserRole;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRoleRepository extends PagingAndSortingRepository<UserRole,Long> {
}
