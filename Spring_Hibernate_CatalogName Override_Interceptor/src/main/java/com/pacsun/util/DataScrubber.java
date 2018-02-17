package com.pacsun.util;

import java.text.DecimalFormat;
import java.util.List;

public class DataScrubber {
	public static String zeroPad(String inStr, int maxStrLen) {
		String outStr = "";
		String tempStr = "";
		int tempInt = 0;
		int strLen = 0;

		if ((inStr != null) && (inStr.length() > 0)) {
			if (inStr.indexOf(".") > 0) {
				if (inStr.indexOf(".") == inStr.trim().length() - 2) {
					tempStr = inStr.replace(".", "");
					tempStr = tempStr + "0";
				} else {
					tempStr = inStr.replace(".", "");
				}
			} else {
				tempStr = inStr.trim();
			}
			outStr = tempStr.trim();

			if (outStr.trim().length() > maxStrLen) {
				tempStr = outStr.substring(0, maxStrLen);
				outStr = tempStr.trim();
			} else if (outStr.trim().length() < maxStrLen) {
				try {
					tempInt = Integer.parseInt(outStr);

					switch (maxStrLen) {
					case 2:
						outStr = String.format("%02d", new Object[] { Integer.valueOf(tempInt) });
						break;
					case 3:
						outStr = String.format("%03d", new Object[] { Integer.valueOf(tempInt) });
						break;
					case 4:
						outStr = String.format("%04d", new Object[] { Integer.valueOf(tempInt) });
						break;
					case 5:
						outStr = String.format("%05d", new Object[] { Integer.valueOf(tempInt) });
						break;
					case 6:
						outStr = String.format("%06d", new Object[] { Integer.valueOf(tempInt) });
						break;
					case 7:
						outStr = String.format("%07d", new Object[] { Integer.valueOf(tempInt) });
						break;
					case 8:
						outStr = String.format("%08d", new Object[] { Integer.valueOf(tempInt) });
					}

				} catch (NumberFormatException nfe) {
					strLen = outStr.trim().length();

					switch (strLen) {
					case 1:
						outStr = outStr + "   ";
					case 2:
					case 3:
					}
				}
				outStr = outStr + "  ";
				outStr = outStr + " ";
			}

		}

		label446: return outStr;
	}

	public static double roundTwoDecimals(double d) {
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		return Double.valueOf(twoDForm.format(d)).doubleValue();
	}

	public static String getNumberList(List<Integer> int_numbers) {
		StringBuilder sb = new StringBuilder();

		if ((int_numbers != null) && (int_numbers.size() > 0)) {
			for (int i = 0; i < int_numbers.size(); i++) {
				sb.append(int_numbers.get(i));
				sb.append(",");
			}

			sb.deleteCharAt(sb.lastIndexOf(","));
		}
		return sb.toString();
	}

	public static String stripNonValidXMLCharacters(String in) {
		StringBuffer out = new StringBuffer(); // Used to hold the output.
		char current; // Used to reference the current character.

		if (in == null || ("".equals(in)))
			return ""; // vacancy test.
		for (int i = 0; i < in.length(); i++) {
			current = in.charAt(i); // NOTE: No IndexOutOfBoundsException caught
									// here; it should not happen.
			if ((current == 0x9) || (current == 0xA) || (current == 0xD)
					|| ((current >= 0x20) && (current <= 0xD7FF))
					|| ((current >= 0xE000) && (current <= 0xFFFD))
					|| ((current >= 0x10000) && (current <= 0x10FFFF)))
				out.append(current);
		}
		return out.toString();
	}
}

/*
 * Location: C:\temp\ps_catalog.jar Qualified Name:
 * com.pacsun.dw.catalog.util.DataScrubber JD-Core Version: 0.6.0
 */