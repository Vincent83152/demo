package com.example.Model.Dao;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class LoginDao extends TempletDao  {
   public Object getUser(){
        Query query =  getManager().createQuery("from user");        
        Object list = query.getResultList();
        return list;
   }
}
