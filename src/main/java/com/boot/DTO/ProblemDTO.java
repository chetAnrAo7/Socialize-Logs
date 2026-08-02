package com.boot.DTO;

public class ProblemDTO
{
    String problemId;
    String authDBId;
    String username;
    String problem;

    public ProblemDTO() {
    }

    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }

    public String getAuthDBId() {
        return authDBId;
    }

    public void setAuthDBId(String authDBId) {
        this.authDBId = authDBId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
}