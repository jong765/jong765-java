package com.pacsun.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtil {

	// Convert java object to JSON string
	public static String convertObjectToJSON(Object obj) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		// Object to JSON in String
		String jsonString = mapper.writeValueAsString(obj);
		return jsonString;
	}

	// Convert JSON string to java object
	public static Object convertJSONToObject(String str) throws JsonParseException,
			JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		// JSON from String to Object
		Object obj = mapper.readValue(str, Object.class);
		return obj;
	}
}
