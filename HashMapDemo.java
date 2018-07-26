package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		hm.put(9, "Bhavagavad Geetha");
		hm.put(10, "Mahabharata");
		hm.put(11, "Ramayana");
		hm.put(6, "Wings of Fire");
		hm.put(98, "Bhavagavatha");
		System.out.println(hm);
		System.out.println(hm.values());
		System.out.println(hm.get(10));
		System.out.println(hm.remove(6));
		System.out.println(hm);
		h.put(8, "killkji");
		h.putAll(hm);
		System.out.println(hm.replace(10, "swagatam"));
		System.out.println(hm);
		System.out.println(h);
		Set sets = hm.entrySet();
		System.out.println(sets);
		Iterator itr  = sets.iterator();
		
		while(itr.hasNext()){
			Entry<Integer, String> mentry = (Entry<Integer, String>)itr.next();
			System.out.println("key is "+mentry.getKey());
			System.out.println("value is "+mentry.getValue());
			//sleep(1000);
		}

	}

}
