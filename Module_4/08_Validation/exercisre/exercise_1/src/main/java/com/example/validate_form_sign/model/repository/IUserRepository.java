package com.example.validate_form_sign.model.repository;

import com.example.validate_form_sign.model.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends PagingAndSortingRepository<User,Integer> {
}
