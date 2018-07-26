package threadclass;

public class EmployeeOld implements Runnable{
	Employee emp;//reference variable
	EmployeeOld(Employee emp)
	{
		super();
		this.emp = emp;	
	}
	@Override
	public void run() {
		// Object lock - synchronized block with object name
		 try {
		synchronized (emp){
			 System.out.println(Thread.currentThread().getName()+"is waiting for retirement"+emp.getEname());
				emp.wait();
				
			} 
		 }
		 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   System.out.println(Thread.currentThread().getName()+": it's retirement time!! new employee can join");

	}

}
