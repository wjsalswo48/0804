
public class Student {
	private String name,hakbun;
	private int kor,eng,mat,tot;
	private double avg;
	private char grade;
	
	
	public Student(String hakbun, String name, int kor, int eng, int mat) {
		super(); // super 키워드는 부모 클래스로부터 상속받은 필드나 
				 // 메소드를 자식 클래스에서 참조하는 데 사용하는 참조 변수입니다.
		this.name = name;
		this.hakbun = hakbun;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
