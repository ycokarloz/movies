package dev.seven.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String imdbId);

    List<Movie> findByTitleContaining(String query);

    // Add a custom method to search for movies by title
    List<Movie> findByTitleContainingIgnoreCase(String title);    
}
