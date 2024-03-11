package dev.wenkun.movies;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    
}
