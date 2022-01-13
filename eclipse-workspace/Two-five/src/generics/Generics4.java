package generics;
class WithWild<T extends Number>{
	T data;
	WithWild(T d){ data = d;}
	boolean same(WithWild<?> x) { //?는 와일드카드로 어떤 클래스 타입도 올 수 있다는 의미
		if (Math.abs(data.doubleValue())==Math.abs(x.data.doubleValue()))
				return true;
		return false;
	}
}
public class Generics4 {

	public static void main(String[] args) {
		WithWild<Integer> a = new WithWild<Integer>(6);
		WithWild<Double> b = new WithWild<Double>(-6.0);
		WithWild<Long> c = new WithWild<Long>(5L);
		if (a.same(b)) System.out.println("a and b are equal");
		else System.out.println("a and b are different");
		if (a.same(c)) System.out.println("a and c are equal");
		else System.out.println("a and b are different");
	}
}
