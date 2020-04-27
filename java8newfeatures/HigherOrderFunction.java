package java8newfeatures;
import java.util.List;
import java.util.*;

public class HigherOrderFunction {
	
	   public static void main(String args[]) {
	List<String> list = new ArrayList<>();
	list.add("One");
	list.add("Abc");
	list.add("BCD");

	Collections.sort(list, (String a, String b) -> {
	    return a.compareTo(b);
	});

	System.out.println(list);    
	
	Comparator<String> comparator = (String a, String b) -> {
	    return a.compareTo(b);
	};

	Comparator<String> comparatorReversed = comparator.reversed();

	Collections.sort(list, comparatorReversed);

	System.out.println(list);
	
	   }
}

