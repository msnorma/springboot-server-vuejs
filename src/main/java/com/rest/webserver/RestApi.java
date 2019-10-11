package com.rest.webserver;

public class RestApi {

    private final long id;
    private final String name;

    public RestApi(long id, String content) {
        this.id = id;
        this.name = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return name;
    }
}
