package com.example.dagger22.data;

/**
 * Created by liaodongming on 2016/11/24.
 */

public class Post {
    private final Integer userId;
    private final Integer id;
    private final String title;
    private final String body;

    public Post(Integer userId, Integer id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
