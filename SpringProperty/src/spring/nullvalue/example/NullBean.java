package spring.nullvalue.example;

public class NullBean {
	private String mesg = "no value passed";

	public void setMessage(String mesg) {
		this.mesg = mesg;
	}

	public String getMessage() {
		return mesg;
	}

}
