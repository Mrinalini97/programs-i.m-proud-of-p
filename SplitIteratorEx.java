package collections;
import java.util.*;
public class SplitIteratorEx {

	public static void main(String[] args) {
	List<String> li = new ArrayList<String>();
	li.add("sss");
	Spliterator <String> splits = li.spliterator();
	splits.forEachRemaining(System.out::println);

	}

}
