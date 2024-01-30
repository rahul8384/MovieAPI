package com.minimoviemr.Movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies" )
//this document will let the framework know that this class presents each documents in the movies collection
@Data //lombok functionality to set all the getters and setters
@AllArgsConstructor //another lombok function to set the constructors take all the private field in
@NoArgsConstructor // this doesn't take any private variables in the constructors
public class Movie {
    @Id
    private ObjectId id;

    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genre;
    private List<String> backdrops;

    @DocumentReference
    private List<Review> reviewIds;//embedded relationship one to many relation

}
