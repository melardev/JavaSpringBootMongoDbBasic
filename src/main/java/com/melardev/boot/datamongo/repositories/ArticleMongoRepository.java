package com.melardev.boot.datamongo.repositories;

import com.melardev.boot.datamongo.models.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ArticleMongoRepository extends MongoRepository<Article, String> {
    public List<Article> findByTitleContainingIgnoreCase(String title);
    //public List<Article> findByTitleContains(String title);

    public List<Article> findByCreatedAtAfter(Date date);
}
