class Block{
	Block(){
		System.out.println("I am a constructor");
	}
	{ //non-static ���
		System.out.println("I am a block");
	} //non-static����� ������ ���� ���� ȣ��ȴ�.
	
	static { //static����� ù��° �ν��Ͻ��� �����ϱ� ���� �� �ѹ��� ���� ��
		System.out.println("I am a static block");
	}
}
public class class7 {

	public static void main(String[] args) {
		Block b1 = new Block();
		Block b2 = new Block();
		Block b3 = new Block();
		Block b4 = new Block();

	}

}
