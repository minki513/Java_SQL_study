package generics;
import java.util.*;

public class Generics_10 {

	public static void main(String[] args) {
		ArrayList<String> A = new ArrayList<String>();
		for(int i=0; i<5; i++)
			A.add(i+"");
		
		Iterator<String> it = A.iterator();
		while (it.hasNext())
			System.out.print(it.next());
		
		System.out.println("\n------");
		
		it = A.iterator(); //���ͷ����ʹ� ������ �ȵ�.
		while (it.hasNext())
			System.out.print(it.next());
	}

}
