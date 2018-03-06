package com.pacsun.util;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400Message;
import com.ibm.as400.access.CommandCall;

public class AS400Command {

	private String server = "LOLADEV";
	private String user = "jkim";
	private String password = "superis2a";

	public boolean run(String commandStr) {

		AS400 as400 = null;
		boolean success = false;

		try {
			// Create an AS400 object
			as400 = new AS400(server, user, password);

			// Create a Command object
			CommandCall command = new CommandCall(as400);

			// Run the command.
			System.out.println("Executing: " + commandStr);
			success = command.run(commandStr);

			if (success) {
				System.out.println("Command Executed Successfully.");
			} else {
				System.out.println("Command Failed!");
			}

			// Get the command results
			AS400Message[] messageList = command.getMessageList();
			for (AS400Message message : messageList) {
				System.out.println(message.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Make sure to disconnect
				as400.disconnectAllServices();
			} catch (Exception e) {
			}
		}
		return success;

	}

}
