package lambda_enumeration_annotation;

interface MyValue1{
	int getValue();
}
public class Lambda1 {
	public static void main(String[] args) {
		MyValue1 mv1;
		mv1 = () -> 100; //mv1에 람다 표현식 넣어줌
		System.out.println(mv1.getValue()); //람다 표현식이 수행
		// 람다표현식
		//인터페이스 만들기 -> 인터페이스 참조변수 만들기 -> 참조변수에 람다 표현식 할당
		//-> 람다 표현식 수행 (지연처리)
	}

}
