package generics;
import java.util.*;

public class Generics7 {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10); //���� ž�� ���� item�� �߰�
		stk.push(20);
		stk.push(30);
		Integer data = stk.pop(); //���� ž�� �ִ� ���Ҹ� �����ϰ� ��ȯ
		System.out.println("You popped : " +data);
		stk.push(40);
		
		while(!stk.empty()) //��������� true
			System.out.println(stk.pop());
		
		Stack<Integer> stk2 = new Stack<Integer>();
		stk2.push(10);
		stk2.push(20);
		stk2.push(30);
		Integer data2 = stk2.peek(); //���� ž�� �ִ� ���Ҹ� ��ȯ
		System.out.println("You peeked : " +data2);
		stk2.push(40);
		
		int index = stk2.search(40); //���ÿ��� ��ü�� ã�Ƽ� ������ ��ġ�� ��ȯ
		System.out.println("data2 40 is at "+ index);
		
		while(!stk2.empty())
			System.out.println(stk2.pop());
	}

}
