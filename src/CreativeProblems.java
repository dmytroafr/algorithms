import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CreativeProblems {
//	public static int count = 0;
//	public static FileWriter fileWriter;
//	static void setWriter(){
//		try {
//		 fileWriter = new FileWriter("output.txt");
//		} catch (IOException e){
//			e.printStackTrace();
//		}
//	}
//	static void wriite (List l){
//		try {
//			fileWriter.write(l.toString());
//		}catch (IOException e){
//			e.printStackTrace();
//		}
//	}

	public static void main(String[] args) {
//		setWriter();

		int N = 10;
		int k = 5;
		double p = 0.57;

		double result = binomial(N, k, p);
		double result2 = binomial2(N, k, p);
		System.out.println(result);
		System.out.println(result2);

	}
	public static double binomial (int N, int k, double p){
//		StackTraceElement [] stack = Thread.currentThread().getStackTrace();
//		wriite(Arrays.stream(stack).toList());
//		count++;
		if (N < 0 || k < 0) return 0.0;
		double [][] matrix = new double [N+1][k+1];
		double los = 1.0 - p;

		for (int i = 0; i <=N ; i++) {
			matrix[i][0] = Math.pow(los,i);
		}
		matrix[0][0] = 1.0;

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= k; j++) {
				matrix[i][j] = p * matrix[i-1][j-1]  + los * matrix[i-1][j];
			}
		}
		return matrix[N][k];
//		return (1.0 - p) * binomial(N-1, k, p) + p * binomial(N-1, k-1, p);
	}
	public static double binomial2 (int N, int k, double p){
		if (N == 0 && k == 0) return 1.0;
		if (N < 0 || k < 0) return 0.0;
		return (1.0 - p) * binomial(N-1, k, p) + p * binomial(N-1, k-1, p);
	}
}
