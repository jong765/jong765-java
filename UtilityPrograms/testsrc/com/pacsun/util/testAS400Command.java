package com.pacsun.util;

public class testAS400Command {

	public static void main(String[] args) {

		AS400Command command = new AS400Command();

		String commandStr = "CALL PGM(JKIM/JKTEST)";

		command.run(commandStr);

		System.out.println("Done.");
		System.exit(0);

	}

}
