package com.example.Core.Config;


// @Configuration
// @EnableJpaRepositories(entityManagerFactoryRef = "customerEntityManagerFactory",
// 		transactionManagerRef = "customerTransactionManager")
// public class HibernateConfig {
//     @Bean
// 	PlatformTransactionManager customerTransactionManager() {
// 		return new JpaTransactionManager(customerEntityManagerFactory().getObject());
// 	}

// 	@Bean
// 	LocalContainerEntityManagerFactoryBean customerEntityManagerFactory() {

// 		HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
// 		jpaVendorAdapter.setGenerateDdl(true);

// 		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();

// 		factoryBean.setDataSource(dataSource());
// 		factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
// 		factoryBean.setPackagesToScan(HibernateConfig.class.getPackage().getName());

// 		return factoryBean;
// 	}
//     @Bean
//     @ConfigurationProperties(prefix = "spring.datasource")
//     public DataSource dataSource() {        
//                 return DataSourceBuilder.create().build();
//             }
	// @Bean
    // @ConfigurationProperties(prefix = "spring.datasource")
	// DataSource customerDataSource() {

	// 	return new EmbeddedDatabaseBuilder().//
	// 			setType(EmbeddedDatabaseType.HSQL).//
	// 			setName("testdb").//
	// 			build();
	// }
// }
