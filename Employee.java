package threadclass;

public class Employee {
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public boolean isJoined() {
		return isJoined;
	}
	public void setJoined(boolean isJoined) {
		this.isJoined = isJoined;
	}
	int empId;
	String ename;
	float esal;
	boolean isJoined;

}
