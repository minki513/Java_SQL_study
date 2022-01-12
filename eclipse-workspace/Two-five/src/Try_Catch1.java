package javacode;

public class Try_Catch1 {

	public static void main(String[] args) {
		int a=5, b=0, c;
		try { //예외가 발생할 가능성이 있는 코드
			c = a/b;
			System.out.println("C : " +c);
		}
		catch(ArithmeticException e) { //해당 예외가 발생할 경우 이를 처리하기 위한 코드
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}

}
