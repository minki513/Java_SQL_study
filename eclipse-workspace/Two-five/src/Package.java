package javacode;
import java.util.*;

public class Package {

	public static void main(String[] args) {
		int computerChoice, guess= 0;
		int count =0;
		
		computerChoice = (int)(Math.random() * 100);
		System.out.println("컴퓨터가 1부터 100사이의 하나의 정수를 선택해습니다.");
		System.out.println("*****  컴퓨터가 선택한 수를 맞춰 보세요  *****");
		System.out.println("----------------------------------------");
		
		while(computerChoice != guess)
		{
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			count +=1;
			Scanner scin = new Scanner(System.in);
			guess = scin.nextInt();
			
			if(guess > computerChoice)
				System.out.println("더 작은 수를 입력하세요");
			
			if(guess < computerChoice)
				System.out.println("더 큰 수를 입력하세요");

		}
		
		System.out.println("컴퓨터가 선택한 수를 맞췄습니다.");
		System.out.println("시도횟수는 " +count + "번입니다.");
	}

}
