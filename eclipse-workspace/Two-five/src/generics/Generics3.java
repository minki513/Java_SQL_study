package generics;

class Data2<T extends Number>{ //Number 클래스의 하위 클래스 타입. 
	//T extends v -> 클래스 타입이 v이거나 v클래스의 하위클래스 타입만 올수 있음. 
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
		Data2<Integer> d = new Data2<Integer>(100); //Integer는 Number의 하위클래스임
		int result = d.calcMutiple(5);
		System.out.println(result);

		Data2<Double> e = new Data2<Double>(17.5); //Double는 역시 Number의 하위클래스임
		int result2 = e.calcMutiple(5);
		System.out.println(result2);
	}

}
