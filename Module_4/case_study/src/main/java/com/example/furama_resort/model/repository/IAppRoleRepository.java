package com.example.furama_resort.model.repository;

import com.example.furama_resort.model.login.AppRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppRoleRepository extends PagingAndSortingRepository<AppRole, Long> {
}
