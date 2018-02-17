package spring.map.example;

import java.util.Iterator;
import java.util.Map;

public class MapBean {

	private Map<String, Integer> student;

	public void setDetails(Map<String, Integer> student) {
		this.student = student;
	}

	public void showDetails() {
		Iterator it = student.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}
	}
}
