package org.project.ranking_idol_project;

import com.mongodb.reactivestreams.client.MongoClients;
import org.project.ranking_idol_project.test.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.MongoDbFactoryParser;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@SpringBootApplication
public class RankingIdolProjectApplication {



    public static void main(String[] args) throws Exception {
        SpringApplication.run(RankingIdolProjectApplication.class, args);

        ReactiveMongoOperations mongoOps = new ReactiveMongoTemplate(MongoClients.create(), "database");

        mongoOps.insert(new Person("Joe", 34))
                .then(mongoOps.query(Person.class).matching(where("name").is("Joe")).first())
                .doOnNext(System.out::println)
                .block();

        mongoOps.dropCollection("person").block();

    }
}