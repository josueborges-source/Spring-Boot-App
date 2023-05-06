package com.josueborges.springproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.josueborges.springproject.model.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer>{



}
