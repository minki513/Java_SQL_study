package generics;
import java.util.*;

class Person3 { 
	String name;
	int age;
	Person3(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + ":" + age;
	}
	public boolean equals(Object obj) { //두 객체의 속성이 같은지 판단하는 코드
		if(obj instanceof Person3) {
			Person3 tmp = (Person3)obj;
			return name.equals(tmp.name) && age ==tmp.age;
		}
		return false;
	}
	
	public int hashCode() { //객체의 속성으로 같은 int 값을 반환하는 코드
		return name.hashCode() + age;
	}
}
public class Generics_14 {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
		//HashSet은 같은 내용의 데이터를 중복해서 저장하지 않도록 한다. 
		//그러나 사용자가 만든 객체들은 데이터 값들이 같더라도 중복 처리를 못하는 경우가 있다.
		//equals메소드와 hashCode 메소드를 이용하여 해결한다
		set.add(new String("Alice"));
		set.add(new String("Alice"));
		set.add(new Person3("Robert", 10));
		set.add(new Person3("Robert", 10));
		System.out.println(set);

	}

}
