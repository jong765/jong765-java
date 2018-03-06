package com.pacsun.util;

import java.util.Iterator;
import java.util.Map;

public class MapUtil {

	public static String displayMap(String header, Map<?, ?> map) {

		StringBuffer dest = new StringBuffer(header);

		if (map != null && !map.isEmpty()) {
			Iterator<?> iter = map.keySet().iterator();
			String key, val;
			while (iter.hasNext()) {
				key = (String) iter.next();
				val = (String) map.get(key);
				dest.append(key + "=" + val + "\n");
			}
		}
		return dest.toString();
	}

}
