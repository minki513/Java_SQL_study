package generics;
import java.util.*;

public class Generics7 {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10); //스택 탑에 원소 item을 추가
		stk.push(20);
		stk.push(30);
		Integer data = stk.pop(); //스택 탑에 있는 원소를 삭제하고 반환
		System.out.println("You popped : " +data);
		stk.push(40);
		
		while(!stk.empty()) //비어있으면 true
			System.out.println(stk.pop());
		
		Stack<Integer> stk2 = new Stack<Integer>();
		stk2.push(10);
		stk2.push(20);
		stk2.push(30);
		Integer data2 = stk2.peek(); //스택 탑에 있는 원소를 반환
		System.out.println("You peeked : " +data2);
		stk2.push(40);
		
		int index = stk2.search(40); //스택에서 객체를 찾아서 있으면 위치를 반환
		System.out.println("data2 40 is at "+ index);
		
		while(!stk2.empty())
			System.out.println(stk2.pop());
	}

}
