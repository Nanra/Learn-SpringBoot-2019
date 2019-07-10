package com.learning.learningspring;

import com.learning.learningspring.model.DataBean;
import com.learning.learningspring.model.OtherBean;
import com.learning.learningspring.model.SampleBean;
import com.learning.learningspring.model.SayHello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

public class LearningSpringApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BelajarConfiguration.class, args);
//		DataBean data = context.getBean(DataBean.class);
//		System.out.println(data.getValue());

//		SampleBean data = context.getBean(SampleBean.class);
//		System.out.println(data.getDataBean().getValue());


		// Untuk Materi Depencency Injection 3
//		OtherBean bean = context.getBean(OtherBean.class);

		// Akan Return value = Nanra Sukedy
//		System.out.println(bean.getDataBean().getValue());

		// Akan Return value = Hasibuan
//		System.out.println(bean.getSampleBean().getDataBean().getValue());

		// Materi Component & Component Injection
//		SayHello dataBean = context.getBean(SayHello.class);
//		String response = dataBean.hello("Nanra Sukedy");
//		System.out.println(response);

		// Materi Bean Scope / Penciptaan Bean oleh Spring
//		DataBean bean1 = context.getBean("method1", DataBean.class);
//		System.out.println(bean1.getValue());
//
//		DataBean bean2 = context.getBean("method1", DataBean.class);
//		System.out.println(bean2.getValue());
//
//		DataBean bean3 = context.getBean("method1", DataBean.class);
//		System.out.println(bean3.getValue());

		// Materi Aware

		OtherBean bean = context.getBean(OtherBean.class);
		bean.checkContext();


	}

}
