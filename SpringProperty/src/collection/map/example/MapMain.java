package collection.map.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapMain {
	public static void main(String[] args) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext(
				"context.xml");
		CollegeBean coll = (CollegeBean) beanfactory.getBean("collegeBean2");
		System.out.println(coll);
	}
}
