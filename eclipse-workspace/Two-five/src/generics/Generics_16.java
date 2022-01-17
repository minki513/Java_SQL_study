package generics;
import java.util.*;

class Person4{
	private String name;
	private int score;
	
	Person4(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return "(" + name + "," + score + ")";
	}
}
public class Generics_16 {

	public static void main(String[] args) {
		TreeMap<Integer, Person4> map = new TreeMap<>();
		map.put(3,  new Person4("David", 80));
		map.put(1,  new Person4("Bob", 90));
		map.put(2,  new Person4("Alice", 88));
		map.put(5,  new Person4("Cindy", 77));
		map.put(4,  new Person4("Jenny", 93));
		
		Set<Integer> keySet = map.keySet(); //key들을 반환
		System.out.println(keySet);
		System.out.println("-------------------");
		
		for(Map.Entry<Integer, Person4> e:map.entrySet()) { //모든 엔트리를 반환
			Integer key = e.getKey();
			Person4 value = e.getValue();
			System.out.println(key + ":" +value);
		}
		System.out.println("-------------------");
		Person4 val = (Person4)map.get(3);
		System.out.print("key 3 -> ");
		System.out.println(val);
	}

}
