package hotel;
import java.util.Scanner;
public class MainHotel {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookRoom b = new BookRoom();
		b.create_rooms();
		
		while(true){
		System.out.println("Press:\n1 to see available Rooms\n"
					+ "2 to see room fare\n"
					+ "3 to Book a room\n"
					+ "4 to request a service\n"
					+ "5 to view the menu\n"
					+ "6 to order food\n"
					+ "7 to view your current bill\n"
					+ "8 to get your final bill\n"
					+ "9 to exit\n ");
		int ch = sc.nextInt();
		switch(ch){
		case 1: b.showRooms();
				break;
		case 2: b.roomFare();
				break;
		case 3: b.Booking();
				break;
		case 4: b.Service();
				break;
		case 5: b.menu();
				break;
		case 6: b.orderFood();
				break;
		case 7: b.calculate_bill();
				break;
		case 8: b.BillPrint();
				break;
		case 9: System.out.println("Good Bye!!");
				System.exit(0);
		default: System.out.println("Invalid entry!!!!! X(");
		
		}
		sc.close();
		}
		
	}

}
