package generics;

class Data<T>{ //Ŭ������ ���� ���׸� ��ȣ <>�� ���� �׾ȿ� �Ű����� ���
	T obj; //�ν��Ͻ� ���� obj�� �ڷ����� T��
	Data(T ob){  //������ Data�� �ڷ����� T�� �μ� �Ѱ��� �Է¹���.
		obj = ob;
	}
	T getObj() { //�ν��Ͻ� ���� obj�� �ڷ����� T��
		return obj;
	}
	void showType() {
		System.out.println("Type of T : " +obj.getClass().getName());
	}
}
public class Generics1 {

	public static void main(String[] args) {
		Data<Integer> d1 = new Data<Integer>(100);
		System.out.println(d1.getObj());
		d1.showType();
		
		Data<String> d2 = new Data<String>("JAVA");
		System.out.println(d2.getObj());
		d2.showType();
	}
}
