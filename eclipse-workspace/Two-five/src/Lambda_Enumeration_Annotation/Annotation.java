package lambda_enumeration_annotation;
//어노테이션은 소스코드에 코드외에 부가적인 정보를 넣을 수 있는 기능
class Test4{
	private String msg;
	Test4(String m){
		msg = m;
	}
	@Deprecated //사용할 수는 있지만 사용하지 않는 것을 권함
	String getMsg() {
		return msg;
	}
}
public class Annotation {

	public static void main(String[] args) {
		Test4 t  = new Test4("hello");
		System.out.println(t.getMsg());

	}

}
