package com.example.MongoDB;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class MongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	}

	/*@Bean
	CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate){
		return args -> {
			String email = "Daniel@gmail.com";
			Student student = new Student(2L,
									"2",
									"Nofar",
									"Garashi",
									email);

			*//*Query query = new Query();
			query.addCriteria(Criteria.where("email").is(email).and("id").is(1L));

			List<Student> students =  mongoTemplate.find(query, Student.class);
			repository.insert(student);

			for(Student s: students)
				System.out.println(s);*//*
			repository.insert(student);
			Optional<List<Student>> s = repository.findStudentByEmail(email);
			s.stream().forEach(System.out::print);

		};
	}*/


}
