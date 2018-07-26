package threadclass;

public class ThreadPC {

	public static void main(String[] args) {
		Student stud = new Student(123,"rama",true);
		Student stud1 = new Student(125,"ramya",true);
		StudentOld so1 = new StudentOld(stud);
		Thread sot = new Thread(so1,"Student1");
		sot.start();
		try{
			Thread.sleep(1500);
			
		}
		catch (InterruptedException e) {
			  
			   e.printStackTrace();
			  }
		StudentNew sn1 = new StudentNew(stud1);
		Thread snt = new Thread(sn1,"Studnew");
		snt.start();

	}

}
