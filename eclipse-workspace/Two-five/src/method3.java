
public class method3 {

	public static void varArgTest(int ... v) //�����μ�
	{
		System.out.println("number of arguments : " + v.length);
		for(int i=0; i<v.length; i++)
		{
			System.out.println(v[i]);
		}
	}
	
	public static int largerThanValue(int value, int ... v) //�Ϲ��μ��� �����μ��� ��� ����Ҷ��� �����μ��� �� �������� �������
	// �����μ� ������ �ϳ��� ��밡����
	{
		int sum = 0;
		for(int i=0;i<v.length;i++)
		{
			if (v[i] >=value)
				sum +=v[i];
					
		}
		return sum;
			
	}
	
	public static void main(String[] args) {
	//�����μ�
		varArgTest();
		varArgTest(1);
		varArgTest(3,5);
		varArgTest(100, 200, 300);
		
		int largerSum;
		largerSum = largerThanValue(10, 5, 3, 11, 17, 2, 20, 15);
		System.out.println("sum : " + largerSum);
	}

}
