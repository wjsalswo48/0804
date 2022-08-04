
public class Practice {
	public static void main(String[] args) {
		int[][] A = {{1,2},{3,4}};
		int[][] B = {{5,6},{7,8}};
		int [][]array;
		array= new int[2][];
	
	}
	static void matrixAdd(int [][] A, int [][] B, int [][] results) {
		for(int i = 0 ; i<A.length; i++) {
			for(int j = 0 ; j<A[i].length; j++) {
				results[i][j] = A[i][j] + B[i][j];
			}
		}
	}
	static void matrixPrint(int [][] results) {
		for(int i=0; i<results.length;i++) {
			
		}
	}
}
