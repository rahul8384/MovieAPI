package com.minimoviemr.Movies;
/*and this movie repository Interface is just movie access layer for our API
* It does the job of actually talking to the database and getting the data back*/

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String imdbId);
}
