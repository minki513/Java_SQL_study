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
	public boolean equals(Object obj) { //�� ��ü�� �Ӽ��� ������ �Ǵ��ϴ� �ڵ�
		if(obj instanceof Person3) {
			Person3 tmp = (Person3)obj;
			return name.equals(tmp.name) && age ==tmp.age;
		}
		return false;
	}
	
	public int hashCode() { //��ü�� �Ӽ����� ���� int ���� ��ȯ�ϴ� �ڵ�
		return name.hashCode() + age;
	}
}
public class Generics_14 {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
		//HashSet�� ���� ������ �����͸� �ߺ��ؼ� �������� �ʵ��� �Ѵ�. 
		//�׷��� ����ڰ� ���� ��ü���� ������ ������ ������ �ߺ� ó���� ���ϴ� ��찡 �ִ�.
		//equals�޼ҵ�� hashCode �޼ҵ带 �̿��Ͽ� �ذ��Ѵ�
		set.add(new String("Alice"));
		set.add(new String("Alice"));
		set.add(new Person3("Robert", 10));
		set.add(new Person3("Robert", 10));
		System.out.println(set);

	}

}
