import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {

	public static void main(String args[]){
		Country c1 = new Country("India");
		Country c2 = new Country("India");
		Map<Country,String> hashMapCountry = new HashMap<Country,String>();
		//c1.setName("India");
		//c2.setName("India");
		hashMapCountry.put(c1, "Delhi");
		hashMapCountry.put(c2, "Delhi");
		System.out.println("Country1 equals country2"+c1.equals(c2));
		System.out.println("Size"+hashMapCountry.size()+"hashMapCountry***"+hashMapCountry.get(new Country("India")));
		
	}
	
	
}

