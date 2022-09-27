package com.example.Model.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public abstract class TempletDao {
    @PersistenceContext
    private EntityManager manager;

    public EntityManager getManager(){
        return this.manager;
    }
}
