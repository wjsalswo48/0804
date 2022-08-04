
public class EncapsulationDemo {
	public static void main(String[] args) {
		Car sonata = new Car("sonata",3000);
		System.out.println("이름은 " + sonata.getName() + " 가격은 " + sonata.getPrice() + "만원입니다");
		sonata.setInfo("아반떼", 5000);
		System.out.println("이름은 " + sonata.getName() + " 가격은 " + sonata.getPrice() + "만원입니다");
	}
}
