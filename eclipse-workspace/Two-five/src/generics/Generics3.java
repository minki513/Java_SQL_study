package generics;

class Data2<T extends Number>{ //Number Ŭ������ ���� Ŭ���� Ÿ��. 
	//T extends v -> Ŭ���� Ÿ���� v�̰ų� vŬ������ ����Ŭ���� Ÿ�Ը� �ü� ����. 
	T obj;
	Data2(T ob){
		obj = ob;
	}
	int calcMutiple(int n) {
		return obj.intValue() *n;
	}
}

public class Generics3 {

	public static void main(String[] args) {
		Data2<Integer> d = new Data2<Integer>(100); //Integer�� Number�� ����Ŭ������
		int result = d.calcMutiple(5);
		System.out.println(result);

		Data2<Double> e = new Data2<Double>(17.5); //Double�� ���� Number�� ����Ŭ������
		int result2 = e.calcMutiple(5);
		System.out.println(result2);
	}

}
