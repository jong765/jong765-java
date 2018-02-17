package spring.nullvalue.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NullBeanMain {
	public static void main(String[] args) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext(
				"context.xml");
		NullBean bean = (NullBean) beanfactory.getBean("basic");
		System.out.println(bean.getMessage());
	}
}
