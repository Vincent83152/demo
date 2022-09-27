package com.example.Core.Config;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class MybaitsConfig {
    
    @Bean(name = "SqlSessionFactory ")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource){
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionfactory = builder.build(getconfig(dataSource));        
        return sessionfactory;
    } 

    private org.apache.ibatis.session.Configuration getconfig( DataSource dataSource){
        org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration();
        config.setEnvironment(new Environment("development", new JdbcTransactionFactory(),dataSource));
        config.addMappers("com.example.Mapper");
        return config;
    }


}
