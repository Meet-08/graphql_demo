package com.meet.gpltest.repository;

import com.meet.gpltest.models.AcademicDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AcademicDetailsRepository extends MongoRepository<AcademicDetails, String> {
}
