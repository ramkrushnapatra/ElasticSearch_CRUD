package org.example;

import org.example.schema.Parking;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ParkingRepository extends ElasticsearchRepository<Parking, String> {
    // Full-text search query on location field
    @Query("{\"match\": {\"location\": {\"query\": \"?0\"}}}")
    List<Parking> searchByLocation(String location);


    //for exact search use term
    @Query("{\"term\": {\"location.keyword\": {\"value\": \"?0\"}}}")
    List<Parking> findByLocationExact(String location);
}
