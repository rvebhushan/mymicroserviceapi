package com.mymicroservice.mymicroservice.repo;

import com.mymicroservice.mymicroservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}