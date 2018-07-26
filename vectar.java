package collections;
import java.util.Vector;
public class vectar {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Vector<Character> v = new Vector<Character>();//1
		v.add(new Character('a'));//2
		v.add(new Character('b'));
		v.add(new Character('c'));
		v.add(new Character('8'));
		v.add(new Character('j'));
		for(Character c: v){//3
			System.out.println(c);
		}
		System.out.println("Vectar1: " + v);
		//System.out.println(v.lastElement());
		Character k = v.lastElement();//5
		v.remove(k);
		System.out.println("Vectar1: " + v);
		v.add(2,'h');//4
		System.out.println("Vectar1: " + v);
		int mid = v.size()/2;//6
		v.set(mid, 'n');
		System.out.println("Vectar1: " + v);
		System.out.println(v.subList(2, 5));
		
		Vector<Character> v1 = new Vector<Character>();
		//v1.addAll(v);
		System.out.println("Vectar2: " + v1);
		
		v1.add(new Character('a'));
		v1.add(new Character('b'));
		v1.add(new Character('n'));
		v1.add(new Character('c'));
		v1.add(new Character('8'));
		v1.add(new Character('7'));
		System.out.println("Vectar2: " + v1);
		boolean b = v1.containsAll(v.subList(2, 5));
		System.out.println("v1 contains v? " +b);
	
	}

}
