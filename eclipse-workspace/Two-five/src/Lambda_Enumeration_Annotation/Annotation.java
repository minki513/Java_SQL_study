package lambda_enumeration_annotation;
//������̼��� �ҽ��ڵ忡 �ڵ�ܿ� �ΰ����� ������ ���� �� �ִ� ���
class Test4{
	private String msg;
	Test4(String m){
		msg = m;
	}
	@Deprecated //����� ���� ������ ������� �ʴ� ���� ����
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
