class Block{
	Block(){
		System.out.println("I am a constructor");
	}
	{ //non-static 블록
		System.out.println("I am a block");
	} //non-static블록은 생성자 보다 먼저 호출된다.
	
	static { //static블록은 첫번째 인스턴스를 생성하기 전에 딱 한번만 수행 됨
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
