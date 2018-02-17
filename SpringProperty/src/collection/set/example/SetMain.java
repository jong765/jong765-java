package collection.set.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetMain {
	public static void main(String[] args) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext(
				"context.xml");
		CollegeBean coll = (CollegeBean) beanfactory.getBean("collegeBean1");
		System.out.println(coll);
	}
}
