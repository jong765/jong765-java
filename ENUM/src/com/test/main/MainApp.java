package com.test.main;

import com.test.model.UserStatus;

public class MainApp {

	public static void main(String[] args) {

		System.out.println(UserStatus.ACTIVE.value());

		UserStatus status = UserStatus.PENDING;

		switch (status) {
		case ACTIVE:
			System.out.println("Status is active.");
			break;
		case INACTIVE:
			System.out.println("Status is inactive.");
			break;
		case PENDING:
			System.out.println("Status is pending.");
			break;
		default:
			System.out.println("Status is unknown.");
		}

	}

}
