package hotel;
import java.util.Scanner;
public class BookRoom extends inHouseRest{
	Scanner sc = new Scanner(System.in);
	public BookRoom() {
		System.out.println("Welcome to x--y--z Hotel");
		
	}
	void seeRooms(){
		showRooms();
	}
	
	void roomFare(){
		System.out.println("\nNon A/C Room - Rs.500\n"
				+ "A/C Room - Rs.1000\n"
				+ "Extra bed - Rs.200\n");
	}
	void Booking(){
		
		System.out.println("Press:\n1 for Non A/c Room \n2. for A/c Room \n3.for Extra Bed");
		int chb = sc.nextInt();
		switch(chb){
		case 1: System.out.println("Non A/c room will be booked");
				
				System.out.println("Press 'y' to continue, 'n' to exit");
				char bb1 = sc.next().charAt(0);
				if(bb1 == 'y'){
					System.out.println("Choose the room no.(1-10)");
					int rnn = sc.nextInt();
					bookRoom(rnn,bb1);
					bill = bill+500;
					System.out.println("Non A/c room booked");
				}
				else System.out.println("Not booked");
				break;
		case 2: System.out.println("A/c room will be booked");
				
				System.out.println("Press 'y' to continue, 'n' to exit");
				char bb2 = sc.next().charAt(0);
				if(bb2 == 'y'){
					
					System.out.println("Choose the room no.(1-10)");
					int rnn = sc.nextInt();
					bookRoom(rnn,bb2);
					bill = bill+1000;
					System.out.println("A/c room booked");
				}
				else System.out.println("Not booked");
				break;
		case 3: System.out.println("Extra bed  will booked");
				
				System.out.println("Press 'y' to continue, 'n' to exit");
				char bb3 = sc.next().charAt(0);
				if(bb3 == 'y'){
					bill = bill+200;
					System.out.println("Extra bed booked");
				}
				else System.out.println("Not booked");
				break;
		default:System.out.println("invalid choice");
		
		
		}
	}
	}


