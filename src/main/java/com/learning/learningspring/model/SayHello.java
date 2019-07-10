package com.learning.learningspring.model;

import org.springframework.stereotype.Component;

// Menambahkan Annotation @Component bertujuan
// Agar spring auto membuat bean baru dari class SayHello tanpa
// Membuatkan Bean khusus secara manual pada Bena Configuration

@Component
public class SayHello {

    public String hello(String textName){
        return "Hello " + textName;
    }


}
