package javacode;

public class Try_Catch2 {

	public static void main(String[] args) {
		int a = 5,b=0, c;
		int A[] = new int[3];
		
		try {
			A[3]=100;
			c = a/b;
			
		}
		catch(ArithmeticException e) { //여기에 걸림
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		catch(Exception e) { //Exception 클래스는 모든 예외를 잡음
			System.out.println("없는 인덱스입니다.");
		}
		//catch블록은 순서대로 확인해 나가기때문에 상위클래스인 Exception 클래스에 잡힘
		//catch 괄호에 넣는 예외 간에 상속관계가 성립되면 상위 예외를 더 나중에 적어야함
		
		finally { //무조건 수행하는 코드
			System.out.println("finally 구문");
		}

	}

}
