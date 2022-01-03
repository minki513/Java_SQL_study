import java.util.Arrays;

public class method2 { 
	
	static void updateArray(int[] B)
	{
		for(int i=0; i<B.length; i++)
			B[i] +=10;
	}
	
	public static void main(String[] args) {
		// 메소드에 배열을 넘기거나 반환하는 경우
		int[] A = {3, 5, 1, 9, 8, 10};
		System.out.println(Arrays.toString(A));
		updateArray(A);
		System.out.println(Arrays.toString(A));
	
	}

}
