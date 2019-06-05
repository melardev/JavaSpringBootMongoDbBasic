package com.melardev.boot.datamongo;

import com.melardev.boot.datamongo.models.Article;
import com.melardev.boot.datamongo.repositories.ArticleMongoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class DataMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataMongoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ArticleMongoRepository articleMongoRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                articleMongoRepository.deleteAll();

                final Article article1 = new Article("Spring Boot - MongoDB + Data + Web", "MongoDB",
                        df.parse("10/5/2018"));
                final Article article2 = new Article("Spring Boot - Data + Web", "H2 Console"
                        , df.parse("2/3/2016"));
                final Article article3 = new Article("Spring Cloud - Zuul + Eureka + Rest Web"
                        , "Load Balancer with Zuul", df.parse("5/1/2018"));

                articleMongoRepository.save(article1);
                articleMongoRepository.save(article2);
                articleMongoRepository.save(article3);

            }
        };
    }
}
