package input;
import java.io.*;
import java.util.Scanner;

class Student{
	private int no;
	private String name;
	private int score;
	
	Student(){}
	Student(int no, String name, int score){
		this.no = no;
		this.name = name;
		this.score = score;
	}
	int getNo() {return no;}
	String getName() {return name;}
	int getScore() {return score;}
	public String toString() {
		return no + ":"+name +"(" + score + ")";
	}
	
}
public class Input10 {

	public static void main(String[] args) {
		Student ST[] = new Student[10];
		File file = new File("student.txt");
		Scanner scin = null;
		int i = 0;
		try {
			scin = new Scanner(file);
			while(scin.hasNext()) {
				int no = scin.nextInt();
				String name = scin.next();
				int score = scin.nextInt();
				ST[i++] =new Student(no, name, score);
			}
		}
		catch(IOException e) {
			System.out.println("student.txt not exist!");
		}
		
		System.out.println("==Student list==");
		System.out.println("----------------");
		for(Student s:ST)
			System.out.println(s);
		scin.close();
	}
}
