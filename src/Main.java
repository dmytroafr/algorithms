import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int[] whiteList = sc.nextInt(args[0]);






		System.out.println(gcd(54,22));
	}


//		1.0 Euclid's algorithm
	public static int gcd (int bigger, int smaller){
		if (smaller==0) return bigger;
		int newSmaller = bigger%smaller;
		return gcd(smaller,newSmaller);
	}

	public static int binarySearch(int key, int[] array){
		int low = 0;
		int hi = array.length-1;

		while (low<=hi){
			int mid = low+(hi-low)/2;
			if (key<array[mid]){
				hi = mid-1;
			} else if (key>array[mid]) {
				low = mid+1;
			} else {
				return mid;
			}
		}
		return -1;
	}

//	ARRAYS

//	min, max, average

	public static double maxArray (double[] array){
		double max = array[0];
		for (int i = 1; i<array.length;i++){
			if (array[i]>max) max = array[i];
		}
		return max;
	}
	public static double minArray (double[] array){
		double min = array[0];
		for (int i = 1; i<array.length;i++){
			if (array[i] < min) min = array[i];
		}
		return min;
	}
	public static double averageArray (double[] array){
		double sum = array[0];
		for (int i = 1; i<array.length;i++){
		sum+=array[i];
		}
		return sum / array.length;
	}
//	reverse
	public static double[] reverseArray (double[] array){
		int n = array.length;
		for (int i = 0; i<n/2;i++){
			double temp = array[i];
			array[i] = array[n-1-i];
			array[n-1-i] = temp;
		}
		return array;
	}
}