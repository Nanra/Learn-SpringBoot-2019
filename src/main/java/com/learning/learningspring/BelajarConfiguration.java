package com.learning.learningspring;


import com.learning.learningspring.model.DataBean;
import com.learning.learningspring.model.OtherBean;
import com.learning.learningspring.model.SampleBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BelajarConfiguration {

    @Bean(name = "method1")
    public DataBean createDataBean(){
        DataBean bean = new DataBean("Nanra Sukedy");
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

}
