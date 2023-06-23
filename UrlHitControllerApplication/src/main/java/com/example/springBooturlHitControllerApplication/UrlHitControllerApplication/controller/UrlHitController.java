package com.example.springBooturlHitControllerApplication.UrlHitControllerApplication.controller;

import com.example.springBooturlHitControllerApplication.UrlHitControllerApplication.entity.User;
import com.example.springBooturlHitControllerApplication.UrlHitControllerApplication.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {

    @Autowired
    UrlHitService urlHitService;

    @GetMapping("count")
    public int getHitCount()
    {
        return urlHitService.getHitCount();
    }
    @PostMapping("user/{userName}")
    public String addUser(@PathVariable String userName)
    {
        return urlHitService.add(userName);
    }

}
