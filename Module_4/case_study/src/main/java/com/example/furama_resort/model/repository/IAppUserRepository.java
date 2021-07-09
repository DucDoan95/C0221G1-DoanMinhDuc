package com.example.furama_resort.model.repository;

import com.example.furama_resort.model.login.AppUser;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppUserRepository extends PagingAndSortingRepository<AppUser,Long> {
}
