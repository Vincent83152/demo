package com.example.Util;

public class HibernateUtil {
    // private static final SessionFactory sessionFactory;
    // private static final StandardServiceRegistry serviceRegistry;

    // static {
    //     try {            
    //         // sessionFactory = new Configuration().configure().buildSessionFactory();
    //         Configuration configuration = new Configuration();
    //         configuration.setProperties(getHibernateProperties());
    //         configuration.configure();

    //         serviceRegistry = new StandardServiceRegistryBuilder()
    //                            .applySettings(getHibernateProperties()).build();
    //         sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    //     } catch (Throwable ex) {
    //         throw new ExceptionInInitializerError(ex);
    //     }
    // }

    // public static SessionFactory getSessionFactory() {
    //     return sessionFactory;
    // }

    // public static void closeAllResources() {
    //     sessionFactory.close();
    //     StandardServiceRegistryBuilder.destroy(serviceRegistry);
    // }
    
    // private static Properties getHibernateProperties() {
    //     Properties hibernateProperties = new Properties();
    //     hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
    //     hibernateProperties.put("hibernate.show_sql", false);
    //     hibernateProperties.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/testdb");
    //     hibernateProperties.put("hibernate.connection.username", "root");
    //     hibernateProperties.put("hibernate.connection.password", "P@ssw0rd");
    //     hibernateProperties.put("hibernate.connection.pool_size", "2");
    //     hibernateProperties.put("hibernate.connection.autocommit", "true");
    //     return hibernateProperties;
    // }
}
