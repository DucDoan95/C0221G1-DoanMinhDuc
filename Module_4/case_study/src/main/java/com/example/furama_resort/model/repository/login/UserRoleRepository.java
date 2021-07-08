package com.example.furama_resort.model.repository.login;

import com.example.furama_resort.model.login.AppUser;
import com.example.furama_resort.model.login.UserRole;
import org.apache.catalina.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRoleRepository extends PagingAndSortingRepository<UserRole,Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
