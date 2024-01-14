public class Sol_1_1_30 {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		boolean [][] matrix = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (gcd(i,j)==1)
					matrix[i][j] = true;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%-8b ",matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0) return a;
		int remainder = a % b;
		return gcd(b, remainder);
	}
}
