package com.demo.desjardins.labfinance.repo;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
public class MongoConfiguration {

    public @Bean
    MongoDbFactory mongoDbFactory() {
        return new SimpleMongoDbFactory(new MongoClient(), "labfinance");
    }
}
