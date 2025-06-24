package com.meet.gpltest.repository;

import com.meet.gpltest.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
