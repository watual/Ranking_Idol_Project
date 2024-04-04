package org.project.ranking_idol_project.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public com.mongodb.reactivestreams.client.MongoClient mongoClient() {
        return com.mongodb.reactivestreams.client.MongoClients.create("mongodb://localhost:27017");
    }
}
