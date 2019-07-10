package com.learning.learningspring;


import com.learning.learningspring.model.DataBean;
import com.learning.learningspring.model.SampleBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BelajarConfiguration {

    @Bean
    public DataBean createDataBean(){
        DataBean bean = new DataBean("Nanra Sukedy");
        return bean;

    }
    @Bean
    public SampleBean createSampleBean(DataBean data){
        SampleBean bean = new SampleBean(data);
        return bean;
    }
}
