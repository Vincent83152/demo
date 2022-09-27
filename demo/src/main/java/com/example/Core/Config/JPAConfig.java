package com.example.Core.Config;

// @Configuration
// @EnableJpaRepositories( 
// 	basePackages = {"com.example.Dao"},
// 	entityManagerFactoryRef = "enityManageFactory", 
// 	transactionManagerRef = "transactionManager"
// )
public class JPAConfig {
    
    // @Bean(name = "dataSource")
    // @ConfigurationProperties(prefix = "spring.datasource")
    // public DataSource dataSource() {        
    //     return DataSourceBuilder.create().build();
    // }

    // @Bean(name = "enityManageFactory")
    // public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
    //         @Qualifier("dataSource") DataSource dataSource) {
    //     return builder
    //             .dataSource(dataSource)
    //             .packages("com.example.Model.Pojo")
    //             .persistenceUnit("default")
    //             .build();
    // }

    // @Bean(name = "transactionManager")
    // public PlatformTransactionManager transactionManager(
    //         @Qualifier("enityManageFactory") EntityManagerFactory entityManagerFactory) {
    //     return new JpaTransactionManager(entityManagerFactory);
    // }
}
