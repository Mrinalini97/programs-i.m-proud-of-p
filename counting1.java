package threadclass;

public class counting1 extends Thread{

	counting1()
	{
		 //super("my extending thread");
		 System.out.println("my thread created" + this);
	     start();
	}
	public void run()
	{	try {
		for(int i = 0;i < 10; i++)
		{
			System.out.println("Child Thread2: \t" +i);
			
				Thread.sleep(1750);
			} 
		}
		catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 System.out.println("Thread1 creation over");
		}
}