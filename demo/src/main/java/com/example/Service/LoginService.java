package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mapper.testMapper;
import com.example.Model.Dao.LoginDao;
import com.example.Model.Pojo.user;
import com.example.Repository.CommonRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LoginService {

    @Autowired
    private LoginDao logindao;
    @Autowired
    private testMapper mapper;
    @Autowired
    private CommonRepository repository;

    
    public List<user> findAll() {
        /** 用Mybaits取得 user */
        log.info(mapper.findAll().toString());
         /** 用EntityManager創建sql.Query取得 user */
        log.info(logindao.getUser().toString());
            /** 用SpringJPA取得 user */
        log.info(repository.findAll().toString());
        return null;
    }

    public user findById(){
          /** 用Mybaits取得 user */
          log.info(mapper.findById("1").toString());
          /** 用EntityManager創建sql.Query取得 user */
         log.info(logindao.getUser().toString());
             /** 用SpringJPA取得 user */
         log.info(repository.findAll().toString());

         return null;
    }
}
