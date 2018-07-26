package mrinalini;
import java.util.*;
public class Password {
	public static void main(String[] str){
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your password!!");
	String pswd = sc.next();
	System.out.println(pswd.length());
	char dig = pswd.charAt(pswd.length()-1);
	int splcnt=0;
			for(int i=0;i<pswd.length();i++){
				char ch = pswd.charAt(i);
				if(!Character.isDigit(ch)&&!Character.isLetter(ch))
					splcnt++;
			}
	try{
		if(!(pswd.length()==8)){
			throw(new PasswordException("Length of the password must be 8!!!"));
		}
		else if(!(pswd.charAt(0)>= 65 && pswd.charAt(0)<=90)){
			throw(new PasswordException("First character shud be in Caps!!!"));
		}
		
			
		else if(!(splcnt>0)){
			throw(new PasswordException("special character is a must!!!"));
		}
				
		else  if(!(Character.isDigit(dig)))
		{
			throw(new PasswordException("Last character must be a digit!!!"));
		}
				else{
					System.out.println("Password Registered :) ");
				}
		
	}
	catch(PasswordException pe){
		System.out.println("Sorry,Password not accepted:( "+ pe);
	}
	finally{
		System.out.println("Thank you");
		sc.close();
	}
	}
}

class PasswordException extends Exception{
	PasswordException(String str){
		super(str);
	}
}