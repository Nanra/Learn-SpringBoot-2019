package com.learning.learningspring.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// Menambahkan Annotation @PostConstruct berfungsi untuk menandai spring agar memanggil
// Method yang dimaksud untuk pertama kali pembutan Bean

// Menambahkan Annotation @PreDestroy berfungsi untuk menandai Spring
// Agar memanggil Method tersebut saat pembuatan semua bean telah selesai.


@Component
public class DatabaseService {

    @PostConstruct
    public void openConnection(){
        System.out.println("MEMBUKA KONEKSI KE DATABASE");
    }

    @PreDestroy
    public void closeConnection(){
        System.out.println("MENUTUP KONEKSI KE DATABASE");
    }

}
