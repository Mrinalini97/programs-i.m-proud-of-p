package hotel;
import java.util.Scanner;
public class Hotel {
	Scanner sc = new Scanner(System.in);
	int i;
	int bill = 0;
  int[] rooms = new int[10];
  void create_rooms(){
	  for(i=0;i<rooms.length;i++){
		  rooms[i] =0;
	  }
  }
  void bookRoom(int br,char c){
	  if(c == 'y'){
		  if(rooms[br-1] == 0){
			  rooms[br-1] = 1;
			  System.out.println("Room booked! have a good day ");
		  }
		  else System.out.println("Sorry this room is booked!!Try another");
	  }
  }
  void showRooms(){
	  System.out.println("Available Rooms:");
	  for(i=0;i<rooms.length;i++){
		  if(rooms[i]!=1){
			  System.out.print(i+1 +"\t");
		  }
		  
	  }
  }
  
  void BillPrint(){
	  System.out.println("Your bill is : rs."+ bill);
  }
  
  void Service(){
	  System.out.println("Press:\n1 for laundary services \n"
				+ "2 for room cleaning\n");
	  int s = sc.nextInt();
	  switch(s){
	  case 1: System.out.println("you choose laundary.Your request is booked at 1am");
	  		  bill = bill + 200;
	  		  break;
	  case 2: System.out.println("you choose room cleaning!!Your room will be clean by 2 am");
	  	 	  break;
	  default: System.out.println("Invalid choice,choose either1 or 2");
	  }
  }
  
}

