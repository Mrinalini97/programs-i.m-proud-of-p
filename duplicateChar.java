package mrinalini;

import java.util.Scanner;

public class duplicateChar {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,flag=0;
		
		//int size = sc.nextInt();
		System.out.println("enter characters ");
		int[] a = new int[1000];
		
		String str = sc.nextLine();
		int size = str.length();
		System.out.println(size);
		char[] ch = new char[size];
		ch = str.toCharArray();
		for(i=0;i<size;i++){
			//ch[i] = sc.next().charAt(0);
			a[(int)ch[i]]++;
			if(a[(int)ch[i]] > 1) {
				System.out.println("position: "+ (i+1)+" " + "Char: " + ch[i]);
				flag = 1;
			
		}
		}
		/*for(i=0;i<size;i++){
			if(a[(int)ch[i]] > 1) { System.out.println(ch[i] +" is repeated " + a[(int)ch[i]]+ " times" );}
		}*/
			
		
		if (flag==1) System.out.println("duplicate found ");
		else System.out.println("no duplicates found :");
		sc.close();
		}
}
