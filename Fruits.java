package collections;

import java.util.HashMap;
import java.util.Scanner;
public class Fruits {

	public static void main(String[] args) {
	HashMap<String, Integer> fl = new HashMap<String, Integer>();
	//HashMap<String, Integer> bill = new HashMap<String, Integer>();
	fl.put("Apple", 180);
	fl.put("Mango", 60);
	fl.put("Grapes", 80);
	fl.put("Banana", 40);
	fl.put("chickoo", 110);
	fl.put("Gauva", 60);
	fl.put("Pomegranate", 160);
	System.out.println(fl);
	/*bill.putAll(fl);
	bill.remove("Mango");
	bill.remove("Grapes");
	bill.remove("Gauva");
	System.out.println(bill);
	//sum(bill.values()));
	Integer i = bill.get("Apple")+bill.get("chickoo")+bill.get("Pomegranate")+bill.get("Banana");
	System.out.println("Total bill: "+i);*/
	Scanner sc = new Scanner(System.in);
	int bill =0;
	int qu = 1;
	while(true){
	System.out.println("The BillBasket\nEnter \n1 for Apple\n2 for mango\n3 for grapes\n4 for banana\n5 for chickoo\n6 for gauva\n7 for pomagranate\n8 to exit ");
	
	int hg= sc.nextInt();
	
	System.out.println("Enter quantity");
	qu= sc.nextInt();
	
	switch (hg) {
	case 1: bill = bill + (qu*fl.get("Apple"));
			break;
	case 2: bill = bill + (qu*fl.get("Mango"));
			break;
	case 3: bill = bill + (qu*fl.get("Grapes"));
			break;
	case 4: bill = bill + (qu*fl.get("Banana"));
			break;
	case 5: bill = bill + (qu*fl.get("chickoo"));
			break;
	case 6: bill = bill + (qu*fl.get("Gauva"));
			break;
	case 7: bill = bill + (qu*fl.get("Pomegranate"));
			break;
	case 8: System.exit(0);
			break;

	default: System.out.println("Come on . grow up!!");
	break;
		
	}
	System.out.println("Bill "+bill);
	
	}
	//sc.close();
	
	}

	
}
