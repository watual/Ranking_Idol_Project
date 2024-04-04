package org.project.ranking_idol_project.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "mflex")
public class MflexDocument {
    @Id
    private String id;
    private String name;
    private String email;
    private String movie_id;
    private String text;
    private String date;
}
