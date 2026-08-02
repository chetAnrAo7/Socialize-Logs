package com.boot.api;


import com.boot.DTO.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Map;

@FeignClient(name = "auth-service",url = "${auth.service.url}")
public interface AuthServiceFeignClient
{
    @GetMapping("/api/internal/user/{username}")
    UserDTO getUser(@PathVariable String username);

    @GetMapping("/api/internal/user/id/{id}")
    UserDTO getUserById(@PathVariable String id);

    @GetMapping("/api/internal/getUsersInfoForFeed")
    Map<String,UserDTO> getAllUsersInfo();
}