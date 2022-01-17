package lambda_enumeration_annotation;

interface Test2{
	int getSum(int n);
}
public class Lambda3 {

	public static void main(String[] args) {
		Test2 t = (n) -> { //��� ���� ǥ����
			int result =0;
			for(int i =1; i<=n; i++)
				result += i;
			return result;
		}; //�ݵ�� �����ݷ��� �־����
		System.out.println("sum from 1 to 10 is " +t.getSum(10));
		System.out.println("sum from 1 to 20 is " +t.getSum(20));
		System.out.println("sum from 1 to 30 is " +t.getSum(30));
	}

}
