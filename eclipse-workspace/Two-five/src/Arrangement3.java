import java.util.Arrays;

public class Arrangement3 {

	public static void main(String[] args) {
		//배열 복사하기
		int[] original = {4, 2, 9, 7, 10, 3};
		int[] destination = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.arraycopy(original, 2, destination, 4, 3);
		// original[2]부터 시작하여 3개 원소를 destination[4]부터 복사하라.
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(destination));

	}

}
