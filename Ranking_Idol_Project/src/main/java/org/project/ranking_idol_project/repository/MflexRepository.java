package org.project.ranking_idol_project.repository;

import org.project.ranking_idol_project.document.MflexDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MflexRepository extends MongoRepository<MflexDocument, String> {
    // 어떤 entity를 다룰 것이냐, entity의 pk 자료형[@id 붙인 column의 type

}
