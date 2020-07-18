package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<String, String> map= new HashMap<>();
		
		//Map<String, String> map= new Hashtable<>(); //it doesnot allow null key
		
		map.put("name", "anand bhayre");
		map.put("email", "anand1234@gmail.com");
		map.put(null, "jkhskdlj");
		
		
		System.out.println(map.get("name"));

		System.out.println(map.get("email"));
	}

}
