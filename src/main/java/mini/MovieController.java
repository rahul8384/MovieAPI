package com.minimoviemr.Movies;
/*in rest Api there are many layers, so one of the layers in API layer
which is this movie controller class, it will only concern itself about getting a request from the user
and returning a request from the user

it is using a service class which is fetching all the movie data from the database
and giving it back to the api layer so it call the all movie method from the movieService class
gets the movie from the database and returns the http status ok*/

import org.bson.types.ObjectId;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/minimoviemr/")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(),HttpStatus.OK);
    }

    //path variable lets the framework know that we'll be passing the information
    //we got in the mapping as a path variable or we'll be using information passed in the path variable
    //as a string/object id
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
}
