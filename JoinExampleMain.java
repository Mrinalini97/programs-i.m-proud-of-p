package threadclass;

public class JoinExampleMain {

	public static void main(String args[])
	 {
	               
	  System.out.println("Main thread execution starts");
	  JoinDemo mr=new JoinDemo();
	  
	  Thread t1=new Thread(mr,"Thread 1");
	  Thread t2=new Thread(mr,"Thread 2");
	  Thread t3=new Thread(mr,"Thread 3");
	  
	  t2.start();
	  // lets waits for  t1 to die
	  try {
	   t2.join();
	  } catch (InterruptedException e) {
	   
	   e.printStackTrace();
	  }
	 
	 
	  t1.start();
	 // try {
	 // lets waits for 1 sec or t2 to die which ever occurs first 
	  
	   
	  //} catch (InterruptedException e1) {
	   
	 //  e1.printStackTrace();
	  //}
	  t3.start() ;
	  
	  // complete all threads before completing main thread
	  try { 
		  
	   //t2.join();
	  t3.join();
	   t1.join(4000);
	  } catch (InterruptedException e1) {
	   
	   e1.printStackTrace();
	  }
	  System.out.println("Main thread execution ends");   
	 }

}
