class Car
		{
			String kind; //����
			String color; //����
			int year; //����       �Ӽ� : �� �ν��ͽ����� ���� ������
			
			void run()
			{
				System.out.println("car is runnung");
			}
			
			void speedUp()
			{
				System.out.println("car is speeding up.");
			}                                                 //�޼ҵ� 2��. ��� �ν��Ͻ��� �����մϴ�.
		}


public class class1 {

	public static void main(String[] args) {
		
		Car myCar = new Car(); //new�� �ν��Ͻ��� �����ϴ� Ű�����Դϴ�. �ν��Ͻ� myCar
		myCar.kind = "Sonata";
		myCar.color = "white";
		myCar.year = 2015;
		
		Car yourCar = new Car(); //�ν��Ͻ� yourCar
		yourCar.kind = "Pride";
		yourCar.color = "blue";
		yourCar.year = 2017;
		
		myCar.run();
		yourCar.run();
		
		myCar.speedUp();
		yourCar.speedUp();
	}
}
