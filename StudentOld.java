package threadclass;

public class StudentOld implements Runnable{
	
		Student stud;//reference variable
		StudentOld(Student stud)
		{
			super();
			this.stud = stud;	
		}
		@Override
		public void run() {
			// Object lock - synchronized block with object name
			 try {
			synchronized (stud){
				 System.out.println(Thread.currentThread().getName()+" is waiting for graduation  "+stud.getSname());
					stud.wait();
					
				} 
			 }
			 catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   System.out.println(Thread.currentThread().getName()+" : it's graduation time!! new student can join");

		}


}
