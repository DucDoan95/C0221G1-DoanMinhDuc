package com.example.security_login.model.repository;

import com.example.security_login.model.entity.AppUser;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository  extends PagingAndSortingRepository<AppUser,Long> {
    AppUser findByUserName(String name);
}
