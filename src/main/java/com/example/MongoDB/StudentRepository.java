package com.example.MongoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    @Autowired
    MongoTemplate mongoTemplate;

    public StudentTest save(StudentTest student) {
        return mongoTemplate.save(student);
    }
}
