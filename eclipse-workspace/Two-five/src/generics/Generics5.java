package generics;
import java.util.*;

public class Generics5 {

	public static void main(String[] args) {
		ArrayList<String> number = new ArrayList<String>();
		number.add("one");
		number.add("Two");
		number.add("Three");
		number.add("Four");
		
		for(int i= 0; i<number.size(); i++)
			System.out.println(number.get(i));
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("C");
		list.add("Java");
		list.add("Html");
		list.add(1, "c++");
		for(int i= 0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
		System.out.println();
		
		
		list.set(0, "Fortran");
		for(int i= 0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
		System.out.println();
		
		list.remove(2);
		list.remove("c++");
		for(int i= 0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
	}

}
