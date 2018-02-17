package collection.list.example;

import java.util.List;

public class CollegeBean {
	private List<Object> lists;

	public List<Object> getLists() {
		return lists;
	}

	public void setLists(List<Object> lists) {
		this.lists = lists;
	}

	@Override
	public String toString() {
		return "College [lists=" + lists + "]";
	}
}
