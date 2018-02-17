package spring.map.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapBeanMain {
	public static void main(String[] args) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext(
				"context.xml");
		MapBean bean = (MapBean) beanfactory.getBean("mapbean");
		bean.showDetails();
	}
}
