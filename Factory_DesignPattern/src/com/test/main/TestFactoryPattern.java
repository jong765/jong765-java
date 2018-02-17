package com.test.main;

import com.test.factory.CarFactory;
import com.test.factory.CarType;

public class TestFactoryPattern {
	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.SMALL));
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
	}
}