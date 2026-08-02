package com.boot.DTO;

public class ThoughtDTO
{
    String thoughtId;
    String authDBId;
    String content;
    String username;

    public ThoughtDTO() {
    }

    public String getThoughtId() {
        return thoughtId;
    }

    public void setThoughtId(String thoughtId) {
        this.thoughtId = thoughtId;
    }

    public String getAuthDBId() {
        return authDBId;
    }

    public void setAuthDBId(String authDBId) {
        this.authDBId = authDBId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "ThoughtDTO{" +
                "authDBId='" + authDBId + '\'' +
                ", content='" + content + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
