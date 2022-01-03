import java.util.Arrays;

public class Arrangement4 {

	public static void main(String[] args) {
		// 배열에 배열 대입하기
		int data1[] = {4, 2, 9, 10 ,1};
		int data2[];
		
		data2 = data1;
		
		System.out.println(data1);
		System.out.println(data2); //둘이 같은 참조값을 갖는다.
		
		data1[2] = 5000;
		System.out.println("data1: " + Arrays.toString(data1));
		System.out.println("data2: " + Arrays.toString(data2)); //즉, data1을 수정하면 data2도 같이 수정됨
	}

}
