package generics;

class TwoGenerics<T,V>{ //제네릭 타입을 두개 사용한 클래스 
	T data1;
	V data2;
	TwoGenerics(T d1, V d2){
		data1 = d1;
		data2 = d2;
	}
	void showGenericType() {
		System.out.println("Type of T : " +data1.getClass().getName());
		System.out.println("Type of V : " +data2.getClass().getName());
	}
	T getData1() {return data1;}
	V getData2() {return data2;}
}
public class Generics2 {

	public static void main(String[] args) {
		TwoGenerics<Integer, String> x = new TwoGenerics<Integer,String>(100, "hello");
		x.showGenericType();
		int y = x.getData1();
		System.out.println("value : " +y);
		String z = x.getData2();
		System.out.println("value : " +z);

	}

}
