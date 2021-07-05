package com.example.security_login.model.repository;

import com.example.security_login.model.entity.AppUser;
import com.example.security_login.model.entity.UserRole;
import org.apache.catalina.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRoleRepository extends PagingAndSortingRepository<UserRole,Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
