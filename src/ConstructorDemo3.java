
public class ConstructorDemo3 {
	public static void main(String[] args) {
		Sawon jimin = new Sawon("김지민");
		System.out.println(jimin.name);
		System.out.println(jimin.salary);
	}
}

class Sawon{
	String name;
	int salary;
	public Sawon(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public Sawon(String name) {
		this(name,50000);
		// 반드시 첫줄에 써야지됨
		// ->첫줄에 쓰지 않을시  에러가 발생
		//this.name = name;
		
		//new Sawon(name,50000);
	}
	public Sawon(int salary) {
		this("Unkown",salary); //->이니셜라이저기능이다.
		// 반드시 첫줄에 써야지됨
		// ->첫줄에 쓰지 않을시  에러가 발생
		//this.salary = salary;
		//new Sawon("Unkown",salary);
	}
	public Sawon() {
		this("Unkown",500000);
		// 반드시 첫줄에 써야지됨
		// ->첫줄에 쓰지 않을시  에러가 발생
		//new Sawon("Unkown",500000);
	}
}
