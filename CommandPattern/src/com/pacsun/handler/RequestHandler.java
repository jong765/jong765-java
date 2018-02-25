package com.pacsun.handler;

import java.util.HashMap;
import java.util.Map;

public class RequestHandler {

	private Map<String, Handler> handlers;

	private static final String ERROR = "error";
	private static final String SUCCESS = "success";

	public RequestHandler() {
		createHandlers();
	}

	protected void handle(String actionName, String message) {
		Handler handler = lookupHandlerBy(actionName);
		handler.execute(message);
	}

	private void createHandlers() {
		handlers = new HashMap<String, Handler>();
		handlers.put(ERROR, new ErrorHandler());
		handlers.put(SUCCESS, new SuccessHandler());
	}

	private Handler lookupHandlerBy(String handlerName) {
		return handlers.get(handlerName);
	}

}
