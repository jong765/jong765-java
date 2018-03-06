package com.pacsun.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DoubleByteCharacterDetector {

	public static boolean hasDoubleByteCharacter(String str) {

		boolean hasDoubleByteCharacter = false;

		if (str != null) {
			Pattern p = Pattern.compile("[\u0000-\u007F]*");
			Matcher m = p.matcher(str);
			hasDoubleByteCharacter = !m.matches();
		}

		return hasDoubleByteCharacter;

	}
}
