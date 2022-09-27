package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Pojo.user;

@Repository
public interface CommonRepository extends JpaRepository<user,Long> {
    
}
