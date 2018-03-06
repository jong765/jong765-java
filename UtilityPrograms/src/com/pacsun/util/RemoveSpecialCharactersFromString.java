package com.pacsun.util;

public class RemoveSpecialCharactersFromString {

	public static void main(String[] args) {
		String inputString = " <phone>â€­(910) 548-2743â€¬</phone>";
		String outputString = StripInvalidXmlCharacters.stripNonValidXMLCharacters(inputString);

		System.out.println("outputString=" + outputString);

	}
}
