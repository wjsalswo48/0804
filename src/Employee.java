
public class Employee {
	private String empno;
	private String name;
	private int salary;
	private String hiredate;
	Employee(String empno,String name, int salary, String hiredate) {
		System.out.println("방금 객체가 생성되었습니다.");
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	
	public void myPrint() {
		System.out.printf("%s, %s, %d, %s\n",
				this.empno, this.name,
				this.salary, this.hiredate);
	}
}
