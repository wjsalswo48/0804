
public class Car {
	private String name;
	private int price;

	public Car(String irum, int pri) { // 생성자
		name = irum;
		price = pri;
	}
	//C++에서는 기본적으로 private로 설정이 되어있는데 자바에서는 기본적으로 public으로 설정이 되어있는건가?
	// -> 기본적으로 package로 설정되어있어서 자신이 등록되어 있는 패키지에서만 사용이 가능해진다.
	// -> public의 경우 다른 패키지에서도 접근이 가능하다.
	public void setInfo(String name, int price) { // 메소드
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void MyPrint() {
		System.out.println(this);
	}
	
}
