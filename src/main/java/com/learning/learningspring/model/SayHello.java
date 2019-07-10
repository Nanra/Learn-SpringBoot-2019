package com.learning.learningspring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Menambahkan Annotation @Component bertujuan
// Agar spring auto membuat bean baru dari class SayHello tanpa
// Membuatkan Bean khusus secara manual pada Bena Configuration


// Menambahkan Annotation @Autowired bertujuan untuk mengubungkan component injection
// Antar Component agar Constructor atau Method terdeteksi paramaternya oleh Spring



@Component
public class SayHello {

    private SayHelloFilter filtering;

    @Autowired
    public SayHello(SayHelloFilter filtering) {
        this.filtering = filtering;
    }

    public String hello(String textName){
        return filtering.filterText("Hello " + textName);
    }


}
