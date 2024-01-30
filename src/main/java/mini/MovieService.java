package com.minimoviemr.Movies;
/*so what this service class does is, it uses the repository class, talks to the database and
* get the list of the movies and returns to the api layer which is the movie controller class*/
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired /*this will let the framework know that we want framework to instantiate
    this below class for us*/
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
       // System.out.println(movieRepository.findAll().toString());
            return movieRepository.findAll();
    }

    /*we have used optional <movie> here because if someone passes an id that doesn't exist in the
    * database so that in those cases it can return the null*/
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
