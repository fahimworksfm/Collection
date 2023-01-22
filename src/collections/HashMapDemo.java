package collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap <Integer, String> students = new HashMap<>();
		
		students.put(1, "Anu");
		students.put(2, "Vinod");
		students.put(3, "Naznin");
		
		System.out.println(students.get(3));
		
	}

}
