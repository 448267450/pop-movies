package dev.wenkun.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;


import java.util.List;

@Service
public class MovieService {   
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }


    public java.util.Optional<Movie> singMovie(ObjectId id) {
        return movieRepository.findById(id);
    }
}
