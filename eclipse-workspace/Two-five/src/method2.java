import java.util.Arrays;

public class method2 { 
	
	static void updateArray(int[] B)
	{
		for(int i=0; i<B.length; i++)
			B[i] +=10;
	}
	
	public static void main(String[] args) {
		// �޼ҵ忡 �迭�� �ѱ�ų� ��ȯ�ϴ� ���
		int[] A = {3, 5, 1, 9, 8, 10};
		System.out.println(Arrays.toString(A));
		updateArray(A);
		System.out.println(Arrays.toString(A));
	
	}

}
