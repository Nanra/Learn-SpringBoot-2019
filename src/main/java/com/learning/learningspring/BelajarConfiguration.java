package com.learning.learningspring;


import com.learning.learningspring.model.Author;
import com.learning.learningspring.model.DataBean;
import com.learning.learningspring.model.OtherBean;
import com.learning.learningspring.model.SampleBean;
import com.learning.learningspring.service.DatabaseConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import java.util.ResourceBundle;
import java.util.UUID;

@SpringBootApplication
@PropertySources({
        @PropertySource("classpath:/configuration/contoh.properties")
})
public class BelajarConfiguration {

    @Autowired
    private Environment environment;

//    @Bean
//    public Author createAuthor(){
//        String name = environment.getProperty("author.name");
//        String email = environment.getProperty("author.email");
//        Author author = new Author(name, email);
//        return author;
//    }


    @Bean(name = "method1")
    @Scope("prototype")
    public DataBean createDataBean(){
        String randomId = UUID.randomUUID().toString();
        DataBean bean = new DataBean(randomId);
        return bean;

    }

    // @Bean(name = "idQualifier") diberikan untuk membedakan
    // Dua Method atau lebih yang memanggil Depencency yang sama
    // Agar lebih spesifik saat kedua method tersebut dipanggil

    @Bean(name = "method2")
    public DataBean createDataBean2(){
        DataBean bean = new DataBean("Hasibuan");
        return bean;
    }


    @Bean
    public SampleBean createSampleBean(@Qualifier("method2") DataBean data){
        SampleBean bean = new SampleBean(data);
        return bean;
    }

    @Bean
    public OtherBean createOtherBean(@Qualifier("method1") DataBean param1, SampleBean param2){
        OtherBean bean = new OtherBean(param1, param2);

        return bean;
    }

    @Bean
    @Profile("development")
    public DatabaseConfiguration createDevDatabaseConfig(){
        return new DatabaseConfiguration("DATABASE DEVELOPMENT");
    }

    @Bean
    @Profile("production")
    public DatabaseConfiguration createProdDatabaseConfig(){
        return new DatabaseConfiguration("DATABASE PRODUCTION");
    }

    @Bean(name = "messageSource")
    public MessageSource createMessageSource(){
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages.hello");
        return messageSource;
    }

}
