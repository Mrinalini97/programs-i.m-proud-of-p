package mrinalini;
import java.util.*;
public class UserName{
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		String uname = sc.next();
		try{
		if(uname.length()<6) {
			throw (new WrongUsername("length should be more than 6 characters"));
		}
		else if(!(uname.charAt(0)>=65 && uname.charAt(0)<=95)){
			throw (new WrongUsername("First character should be in Upper case"));
		}
		else System.out.println("user name accepted");
		}
		catch(WrongUsername wu){
			System.out.println("Wrong username \n"+wu);
		}
		finally{
			System.out.println("USERNAME");
			sc.close();
		}

	}

}

class WrongUsername extends Exception{
	WrongUsername(String str){
		super(str);
	}
}