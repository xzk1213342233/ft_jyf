package com.jyf.config;

import javax.sql.DataSource;

import org.nutz.dao.impl.NutDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DataSourceConfig {
	
	 @Autowired
	 private Environment env;
	
	 //数据源配置
	 @Bean
	 public DataSource druidDataSource() {		
		DruidDataSource dataSource = new DruidDataSource();	
		dataSource.setUsername(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
		return dataSource;
	 }

	 //使用NUTZ
	  @Bean
	  public NutDao nutDao(DataSource druidDataSource) {
	  	NutDao nutDao = new NutDao();
	  	nutDao.setDataSource(druidDataSource);
	  	return nutDao;
	  }
}
