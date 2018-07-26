package collections;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String []str) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(new Integer(10));
		al.add(new Integer(20));
		al.add(new Integer(30));
		al.add(new Integer(20));
		System.out.println("First array list " +al);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.addAll(al);
		System.out.println("Second array list " +al2);
		al2.add(new Integer(50));
		al2.add(new Integer(580));
		System.out.println("Second array list 1 " +al2);
		al2.removeAll(al);
		System.out.println("Second array list 2" +al2);
		//al2.removeAll();
		//System.out.println("Second array list " +al2);
		int sz = al2.size();
		System.out.println("size " +sz);
		boolean b = al.contains(20);
		System.out.println("contains 20 " +b);
		System.out.println("Index of an obj " + al.indexOf(20) );
		System.out.println("Last Index of an obj " + al.lastIndexOf(20) );
		al.set(2, 35);
		System.out.println("First array list " +al);
		al.add(4,65);
		System.out.println("First array list " +al);
		System.out.println(al.get(3)+al.get(4));
		//al.clone();
		
	}
}
