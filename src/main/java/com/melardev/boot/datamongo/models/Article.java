package com.melardev.boot.datamongo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "articles")
public class Article {

    @Id
    private String id;


    private String title;
    private String body;


    private Date createdAt;

    public Article() {
    }

    public Article(String title, String body, Date createdAt) {

        this.title = title;
        this.body = body;
        this.createdAt = createdAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
