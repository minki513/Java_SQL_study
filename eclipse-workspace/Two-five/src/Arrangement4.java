import java.util.Arrays;

public class Arrangement4 {

	public static void main(String[] args) {
		// �迭�� �迭 �����ϱ�
		int data1[] = {4, 2, 9, 10 ,1};
		int data2[];
		
		data2 = data1;
		
		System.out.println(data1);
		System.out.println(data2); //���� ���� �������� ���´�.
		
		data1[2] = 5000;
		System.out.println("data1: " + Arrays.toString(data1));
		System.out.println("data2: " + Arrays.toString(data2)); //��, data1�� �����ϸ� data2�� ���� ������
	}

}
