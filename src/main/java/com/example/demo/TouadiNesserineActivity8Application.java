package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

//implements CommandLineRunner

@SpringBootApplication
public class TouadiNesserineActivity8Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TouadiNesserineActivity8Application.class, args);		
	}
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void run(String... args) throws Exception {
		//récupérer tous les enregistement sous forme d'un object et les affiché 
		
		jdbcTemplate.query("Select * from wilaya order by id ",
				(rs,rowNum)-> new Wilaya(rs.getInt(1),rs.getBoolean(2),rs.getInt(3),rs.getInt(4),rs.getDate(5)
						,rs.getDate(6),rs.getString(7),rs.getString(8),rs.getString(9)))
		                .forEach(System.out::println);
		       }

}
