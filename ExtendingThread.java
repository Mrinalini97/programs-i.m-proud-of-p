package threadclass;

public class ExtendingThread extends Thread {
	public void start(){
		System.out.println("Started");
	}
	public void run() {
		System.out.println("Runningg.....");
	}
  @SuppressWarnings("deprecation")
public static void main(String[] str) {
	ExtendingThread et = new ExtendingThread();
	//et.start();
	//et.run();
	et.setName("ThreadOne");
	System.out.println(et.getId()+et.getName()+et.getPriority());
	System.out.println(et.isAlive());
	//et.stop();
	//et.destroy();
	
}
}
