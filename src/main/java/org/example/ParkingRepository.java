package org.example;

import org.example.schema.Parking;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ParkingRepository extends ElasticsearchRepository<Parking, String> {}
