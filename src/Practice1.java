
public class Practice1 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int current = 0;
		pibo(num1,num2,7);
		System.out.println();
		for(int i = 0; i<7; i++) {
			current = num2;
			num2 += num1;
			System.out.print(current+"\t");
			num1 = current;
		}
	}
	static void pibo(int n1, int n2, int i) {
		int current = n2;
		n2 += n1;
		System.out.print(current+"\t");
		i--;
		if(i==0) return;
		else if(i>0) {
			pibo(current,n2,i);
		}
	}
}
