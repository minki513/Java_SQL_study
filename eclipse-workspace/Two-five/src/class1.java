class Car
		{
			String kind; //차종
			String color; //색상
			int year; //연식       속성 : 각 인스터스마다 갖는 데이터
			
			void run()
			{
				System.out.println("car is runnung");
			}
			
			void speedUp()
			{
				System.out.println("car is speeding up.");
			}                                                 //메소드 2개. 모든 인스턴스가 공유합니다.
		}


public class class1 {

	public static void main(String[] args) {
		
		Car myCar = new Car(); //new는 인스턴스를 생성하는 키워드입니다. 인스턴스 myCar
		myCar.kind = "Sonata";
		myCar.color = "white";
		myCar.year = 2015;
		
		Car yourCar = new Car(); //인스턴스 yourCar
		yourCar.kind = "Pride";
		yourCar.color = "blue";
		yourCar.year = 2017;
		
		myCar.run();
		yourCar.run();
		
		myCar.speedUp();
		yourCar.speedUp();
	}
}
