package org.example.schema;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "parking")
public class Parking {
    @Id
    private String id;
    private String location;
    private boolean available;

    // getters/setters
}
