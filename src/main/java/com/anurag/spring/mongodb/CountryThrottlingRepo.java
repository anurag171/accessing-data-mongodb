package com.anurag.spring.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryThrottlingRepo extends MongoRepository<CountryThrottlingData, String> {

}
