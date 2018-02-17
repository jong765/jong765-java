package collection.props.example;

import java.util.Properties;

public class CollegeBean {
	private Properties pros;

	public Properties getPros() {
		return pros;
	}

	public void setPros(Properties pros) {
		this.pros = pros;
	}

	@Override
	public String toString() {
		return "College [Props=" + pros + "]";
	}
}
