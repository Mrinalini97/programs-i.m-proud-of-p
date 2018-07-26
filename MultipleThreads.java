package threadclass;

public class MultipleThreads {

	public static void main(String args[])
	   {
	      Counting cnt = new Counting();
	      counting1 cnt1 = new counting1(); 
	      //public synchronize void me(){
	    	  System.out.println();
	      
	      try
	      {
	    	  for(int i = 0;i < 10; i++)
	  		{
	  			System.out.println("Main Thread: \t" +i);
	  			
	  				Thread.sleep(2000);
	  			} 
	        /** while(cnt.isAlive())
	         {
	           System.out.println("Main thread will be alive till the child thread is live");
	           Thread.sleep(1500);
	         }**/
	      }
	      catch(InterruptedException e)
	      {
	        System.out.println("Main thread interrupted");
	      }
	      System.out.println("Main thread's run is over" );
	   }

}