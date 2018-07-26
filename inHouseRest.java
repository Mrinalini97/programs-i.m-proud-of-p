package hotel;
import java.util.Scanner;
public class inHouseRest extends Hotel{
	Scanner sc = new Scanner(System.in);
	void orderFood(){
		System.out.println("Enter your room number:");
		int rn = sc.nextInt();
		if(rooms[rn] == 1){
			System.out.println("Press:\n 1 for coffee/tea \n 2. for breakfast \n 3.for lunch,south indian thali\n 4. for lunch,north indian thali\n 5. for dinner,south indian thali\n 6. for dinner,north indian thali\n");
			int choice = sc.nextInt();
			switch(choice){
			case 1: System.out.println("you booked a coffee");
					bill = bill+30;
					break;
			case 2: System.out.println("you booked a breakfast");
					bill = bill+60;
					break;
			case 3: System.out.println("you booked a lunch,south indian thali");
					bill = bill+150;
					break;
			case 4: System.out.println("you booked a lunch,north indian thali");
					bill = bill+200;
					break;
			case 5: System.out.println("you booked a dinner,south indian thali");
					bill = bill+200;
					break;
			case 6: System.out.println("you booked a dinner,north indian thali");
					bill = bill+250;
					break;
			default:System.out.println("Invalid choice");
			
			}
		}
		else System.out.println("sorry!this service is available only for hotel's customers");
	}
	void calculate_bill(){
		System.out.println("your current bill is : Rs."+bill);
	}
	void menu(){
		System.out.println("The menu:\n");
		System.out.println("Cofee:30\n"
				+ "Tea:30\n"
				+ "Breakfast:60\n"
				+ "Lunch:south indian:150\n"
				+ "Lunch:north indian:200\n"
				+ "Dinner:south indian:200\n"
				+ "Dinner:north indian:250\n"
				);
		
	}
	
}
