package com.example.furama_resort.model.repository.login;

import com.example.furama_resort.model.login.AppUser;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository  extends PagingAndSortingRepository<AppUser,Long> {
    AppUser findByUserName(String name);
}
