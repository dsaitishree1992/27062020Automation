package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		/*
		 * Set<String> set = new HashSet<>(); //random access so output is random and
		 * duplicate doesn't allow
		 * 
		 * set.add("Puja"); set.add("Prachi"); set.add("Bilwa"); set.add("Puja");
		 * 
		 * 
		 * for(String s:set) { System.out.println(s); }
		 */
		
		
		/*
		 * Set<String> set = new TreeSet<>(); //default sorted
		 * 
		 * set.add("Puja"); set.add("Prachi"); set.add("Bilwa"); set.add("Puja");
		 * 
		 * 
		 * for(String s:set) { System.out.println(s); }
		 */
		
		
		Set<String> set = new LinkedHashSet<>(); 

		
		set.add("Puja");
		set.add("Prachi");
		set.add("Bilwa");
		set.add("Puja");
		
		
		/*
		 * for(String s:set) { System.out.println(s); }
		 */
		
		Iterator<String> it=set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
