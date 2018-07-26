package threadclass;

public class Counting extends Thread{

	Counting()
	{
		 //super("my extending thread");
		 System.out.println("my thread created" + this);
	     start();
	}
	public void run()
	{	try {
		for(int i = 0;i < 10; i++)
		{
			System.out.println("Child Thread1: \t" +i);
			
				Thread.sleep(1500);
			} 
		}
		catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 System.out.println("Thread creation over");
		}
	
}