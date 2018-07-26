package threadclass;

public class JoinDemo implements Runnable{
	 
	public void run()
	{
	  try {
	   System.out.println(Thread.currentThread().getName()+" Start");
	   // thread sleeps for 4 secs
	   Thread.sleep(4000);
	   System.out.println(Thread.currentThread().getName()+" end");
	  } catch (InterruptedException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }  
	}
	}