package com.learning.learningspring.model;

import org.springframework.stereotype.Component;

@Component
public class SayHelloFilter {

    public String filterText(String text){
        return text.toUpperCase();
    }

}
