package generics;
import java.util.*;

class Person implements Comparable<Person>{
	private int id;
	private int score;
	Person(){}
	Person(int id, int score){ this.id = id; this.score = score;}
	public String toString() { return "[id=" +id +", score = " + score + "]";}
	public int compareTo(Person p) { 
		return this.id - p.id;
	} //TreeSet에는 대소비교가 가능한 객체만 저장할 수 있음 
	//Person 객체에서 아이디값이랑 성적중 어떤 것을 비교해야하는지 알 수가 없기에 comparable 인터페이스 사용
	
}	
public class Generics_12 {

	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person(3, 83));
		ts.add(new Person(5, 90));
		ts.add(new Person(1, 93));
		ts.add(new Person(2, 88));
		ts.add(new Person(4, 70));
		
		Iterator<Person> itr = ts.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}
