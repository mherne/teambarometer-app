package com.hakarl.teambarometer.app.config;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author armannds
 * @since 2017-11-24
 */
@EnableDynamoDBRepositories(basePackages = "com.hakarl.teambarometer.app")
@Configuration
public class DynamoDBConfig {

    /*
    @Bean
    public AmazonDynamoDB amazonDynamoDB() {
        return AmazonDynamoDBClientBuilder.defaultClient();
    }

    @Bean
    public DynamoDBMapper dynamoDBMapper() {
        return new DynamoDBMapper(amazonDynamoDB());
    }*/
}
