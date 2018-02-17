package collection.merge.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropsMain {
	public static void main(String[] args) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext(
				"context.xml");
		CollegeBean coll = (CollegeBean) beanfactory.getBean("child");
		System.out.println(coll);
	}
}
