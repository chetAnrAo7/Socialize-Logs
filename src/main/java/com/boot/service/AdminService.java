package com.boot.service;

import org.springframework.stereotype.Service;

@Service
public class AdminService
{
    public boolean signInAdmin(String username, String password)
    {
        return username.equals("Socialize_Admin") && password.equals("Socialize_Admin");
    }



}