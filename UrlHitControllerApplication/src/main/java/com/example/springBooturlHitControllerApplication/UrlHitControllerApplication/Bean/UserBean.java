package com.example.springBooturlHitControllerApplication.UrlHitControllerApplication.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class UserBean {

    @Bean
    public List<String> getDataSource(){
        return new ArrayList();
    }

}
