package com.example.springBooturlHitControllerApplication.UrlHitControllerApplication.service;

import com.example.springBooturlHitControllerApplication.UrlHitControllerApplication.entity.User;
import com.example.springBooturlHitControllerApplication.UrlHitControllerApplication.repository.UrlHitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@Service
public class UrlHitService {


    @Autowired
    UrlHitRepo urlHitRepo;
    int hitCount=0;

    public int getHitCount() {
        return hitCount++;
    }


    public String add(String userName) {
         urlHitRepo.add(userName);
         return "User Added";
    }

}


