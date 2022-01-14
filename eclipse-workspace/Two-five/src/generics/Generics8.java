package generics;
import java.util.*;

public class Generics8 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10); //���Ҹ� ť�� �߰�, ������ �����ϸ� lllegalStateException �߻�
		q.add(20);
		q.add(30);
		Integer data = q.poll(); //ť�� ��忡 �ִ� ���Ҹ� ��ȯ�ϰ� ����,���� ť�� ��������� null��ȯ
		System.out.println("You polled : "+ data);
		q.add(40);
		
		while(!q.isEmpty())
			System.out.println(q.poll());

	}

}
