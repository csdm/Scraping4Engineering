package com.claudiodimauro.Scrape4Engineering.api.repositories;

import com.claudiodimauro.Scrape4Engineering.api.models.Pattern;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatterRepository extends MongoRepository<Pattern, String>{
    
}
