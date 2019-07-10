package com.learning.learningspring.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

// ApplicationContextAware berfungsi agar dalam sebuah method kita bisa menginjek
// ApplicationContext untuk dapat mengakses method dari bean lain tanpa harus di MainApplication

public class OtherBean implements ApplicationContextAware {

    private DataBean dataBean;
    private SampleBean sampleBean;

    private ApplicationContext context;

    public OtherBean(DataBean dataBean, SampleBean sampleBean) {
        this.dataBean = dataBean;
        this.sampleBean = sampleBean;
    }

    public DataBean getDataBean() {
        return dataBean;
    }

    public void setDataBean(DataBean dataBean) {
        this.dataBean = dataBean;
    }

    public SampleBean getSampleBean() {
        return sampleBean;
    }

    public void setSampleBean(SampleBean sampleBean) {
        this.sampleBean = sampleBean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public void checkContext(){
        if (context != null) {
            System.out.println("Context ADA !");
        } else {
            System.out.println("Context TIDAK ADA !");
        }
    }
}
