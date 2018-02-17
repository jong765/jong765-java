package collection.set.example;


import java.util.Set;

public class CollegeBean {
	private Set<Object> sets;

	public Set<Object> getSets() {
		return sets;
	}

	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}

	@Override
	public String toString() {
		return "College [sets=" + sets + "]";
	}
}
