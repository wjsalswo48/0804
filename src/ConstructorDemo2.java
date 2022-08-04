import java.util.Scanner;

public class ConstructorDemo2 {
	public static void main(String[] args) {
//		Tiger tiger = new Tiger();
//		System.out.println(tiger.name);
		MyCalendar mc = new MyCalendar();
		System.out.println(mc.year);
	}
}

//class Tiger{
//	String name;
//	int age;
//	boolean flag;
//	double weight;
//	char grade;
//}

class MyCalendar{
	int year, month, day;
	public MyCalendar(){ // public이 있으면 기본생성자로 쓰임
		// -> public이 있고 없고 차이점이 뭐지?
		// -> private로 선언을 하면 기본생성자의 생성을 막는다.
		this.year = 2022; 
		this.month = 8;
		this.day = 4;
	}
}