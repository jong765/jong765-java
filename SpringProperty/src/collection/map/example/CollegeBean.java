package collection.map.example;

import java.util.Map;

public class CollegeBean {
	private Map<Object, Object> maps;

	public Map<Object, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<Object, Object> maps) {
		this.maps = maps;
	}

	@Override
	public String toString() {
		return "College [Maps=" + maps + "]";
	}
}
