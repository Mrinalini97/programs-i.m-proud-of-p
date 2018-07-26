package threadclass;

public class StudentNew implements Runnable{
	Student stu;
	StudentNew(Student stud){
		super();
		stu = stud;
	}
	public void run() {
		// TODO Auto-generated method stub
		try{
			synchronized (stu) {
				   System.out.println("Started joining process of " +stu.getSname() );
				   Thread.sleep(1000);
				   stu.setIsjoined(true);
				   System.out.println("Joining process completed");
				   stu.notify();
				   System.out.println("notified old student");
}
}

		
	catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
