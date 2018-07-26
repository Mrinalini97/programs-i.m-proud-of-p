package threadclass;

public class Student {
	int sid;
	String sname;
	boolean isjoined;
	
	Student (int sid,String sname,boolean isjoined)
	{
		super();
//calls Object class constructor
		this.sid = sid;
		this.sname = sname;
		this.isjoined = isjoined;
	}
		
public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public boolean isIsjoined() {
		return isjoined;
	}

	public void setIsjoined(boolean isjoined) {
		this.isjoined = isjoined;
	}

	
}
