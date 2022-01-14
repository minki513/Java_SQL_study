package generics;
import java.util.*;

public class Generics8 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10); //원소를 큐에 추가, 공간이 부족하면 lllegalStateException 발생
		q.add(20);
		q.add(30);
		Integer data = q.poll(); //큐의 헤드에 있는 원소를 반환하고 삭제,만약 큐가 비어있으면 null반환
		System.out.println("You polled : "+ data);
		q.add(40);
		
		while(!q.isEmpty())
			System.out.println(q.poll());

	}

}
