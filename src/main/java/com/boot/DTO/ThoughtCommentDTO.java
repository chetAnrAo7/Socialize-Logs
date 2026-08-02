package com.boot.DTO;

import java.util.Map;

public class ThoughtCommentDTO {

    private String authDBId;
    private Integer thoughtNumber;
    private String username;
    private Map<String,String> comments;
    private String comment;
    private String thought;
    private String thoughtId;


    public ThoughtCommentDTO() {
    }

    public String getThought() {
        return thought;
    }

    public void setThought(String thought) {
        this.thought = thought;
    }

    public String getThoughtId() {
        return thoughtId;
    }

    public void setThoughtId(String thoughtId) {
        this.thoughtId = thoughtId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAuthDBId() {
        return authDBId;
    }

    public void setAuthDBId(String authDBId) {
        this.authDBId = authDBId;
    }

    public Integer getThoughtNumber() {
        return thoughtNumber;
    }

    public void setThoughtNumber(Integer thoughtNumber) {
        this.thoughtNumber = thoughtNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<String, String> getComments() {
        return comments;
    }

    public void setComments(Map<String, String> comments) {
        this.comments = comments;
    }
}
