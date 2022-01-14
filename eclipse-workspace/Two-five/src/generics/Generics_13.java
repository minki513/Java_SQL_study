package generics;
import java.util.*;

class Person2 {
	private int id;
	private int score;
	Person2(){}
	Person2(int id, int score){ this.id = id; this.score = score;}
	int getScore() {return score;}
	public String toString() { return "[id=" +id +", score = " + score + "]";}
}

class PersonComparator implements Comparator<Person2>{
	public int compare(Person2 o1, Person2 o2)
	{
		return o1.getScore() - o2.getScore();
	}
}
public class Generics_13 {

	public static void main(String[] args) {
		TreeSet<Person2> ts = new TreeSet<>(new PersonComparator());
		ts.add(new Person2(3, 83));
		ts.add(new Person2(5, 93));
		ts.add(new Person2(1, 93));
		ts.add(new Person2(2, 88));
		ts.add(new Person2(4, 70));
		
		Iterator<Person2> itr = ts.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
