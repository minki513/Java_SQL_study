package lambda_enumeration_annotation;

interface Test3<T>{
	boolean test(T n, T m);
}

public class Lambda4 {

	public static void main(String[] args) {
		Test3<Integer> t = (n,m) -> (n<m);
		if(t.test(3, 5))
			System.out.println("3 is less than 5");
		System.out.println();

		Test3<String> z = (a,b) -> a.equals(b);
		String str = "java";
		if(z.test(str, "java"))
			System.out.println("same string");
		else
			System.out.println("different string");
	}

}
