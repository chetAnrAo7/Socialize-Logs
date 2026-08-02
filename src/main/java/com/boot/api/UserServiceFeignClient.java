package com.boot.api;

import com.boot.DTO.ProblemDTO;
import com.boot.DTO.ThoughtCommentDTO;
import com.boot.DTO.ThoughtDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-service",url = "${user.service.url}")
public interface UserServiceFeignClient
{
    @PostMapping("/api/internal/postBotThought")
    ThoughtDTO postBotThought(@RequestBody ThoughtDTO dto);

    @PostMapping("/api/internal/postBotThoughtComment")
    void postBotComment(ThoughtCommentDTO dto);

    @PostMapping("/api/internal/postBotProblem")
    ProblemDTO postBotProblem(ProblemDTO dto);

}