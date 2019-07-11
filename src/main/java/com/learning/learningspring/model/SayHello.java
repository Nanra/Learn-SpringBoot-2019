package com.learning.learningspring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

import java.util.Locale;

// Menambahkan Annotation @Component bertujuan
// Agar spring auto membuat bean baru dari class SayHello tanpa
// Membuatkan Bean khusus secara manual pada Bena Configuration


// Menambahkan Annotation @Autowired bertujuan untuk mengubungkan component injection
// Antar Component agar Constructor atau Method terdeteksi paramaternya oleh Spring



@Component
public class SayHello implements MessageSourceAware {

    private SayHelloFilter filtering;
    private MessageSource messageSource;

    @Autowired
    public SayHello(SayHelloFilter filtering) {
        this.filtering = filtering;
    }

    public String hello(String textName){
        return filtering.filterText(messageSource.getMessage("hello", new Object[]{textName}, Locale.getDefault()));
    }


    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
}
