
public class Arrangement5 {

	public static void main(String[] args) {
		// for - each ��Ÿ�� �ݺ���
		double score[] = {90.5, 88.3, 70.8, 67.2, 92.4, 80.7};
		double total = 0.0;
		double average;
		
		for(double s:score) // for-each ��Ÿ�� �ݺ��� - �迭���� ������
		{
			total +=s;
		}
		average = total/score.length;
		System.out.println("average : " + average);
		
		//2���� �迭������ for-each
		int numbers[][]= {{10, 30, 20, 15},
						{11, 5 ,2 ,9},
						{7 ,8 ,1, 13}};
		for (int[] num: numbers) {
			for(int x: num)
				System.out.print(x + " ");
			System.out.println();
		}
		
	}

}
