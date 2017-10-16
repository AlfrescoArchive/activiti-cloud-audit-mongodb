package org.activiti.cloud.audit;

import org.activiti.cloud.starter.configuration.EnableActivitiAuditMongo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableActivitiAuditMongo
@ComponentScan("org.activiti")
public class MongoAuditApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoAuditApplication.class,
                              args);
    }

    public void run(String... strings) throws Exception {

    }

    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }
}
