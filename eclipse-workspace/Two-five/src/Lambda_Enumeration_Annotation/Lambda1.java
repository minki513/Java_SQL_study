package lambda_enumeration_annotation;

interface MyValue1{
	int getValue();
}
public class Lambda1 {
	public static void main(String[] args) {
		MyValue1 mv1;
		mv1 = () -> 100; //mv1�� ���� ǥ���� �־���
		System.out.println(mv1.getValue()); //���� ǥ������ ����
		// ����ǥ����
		//�������̽� ����� -> �������̽� �������� ����� -> ���������� ���� ǥ���� �Ҵ�
		//-> ���� ǥ���� ���� (����ó��)
	}

}
