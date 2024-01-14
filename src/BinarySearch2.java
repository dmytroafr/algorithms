import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class BinarySearch2 {
	public static void main(String[] args) {
		int[] whitelist = In.readInts(args[0]);
		int[] list = In.readInts(args[1]);

		Arrays.sort(whitelist);
		whitelist = IntStream.of(whitelist).distinct().toArray();

		int length = list.length;

		for (int i = 0; i < length; i++) {
			int key = list[i];

			int rank = rank2(key,whitelist);
			int count = count(key,whitelist);
			System.out.printf("Rank gave : %d, and Count gave : %d.\nSo the sum is %d\n",rank,count,rank+count-1);
			System.out.println(rank(key,whitelist));
		}
	}
	public static int rank(int key, int[] array){
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
	private static int rank2 (int key, int[] array){
		int rank = 0;
		for (int j : array) {
			if (j < key) rank++;
			if (j == key) break;
		}
		return rank;
	}
	private static int count (int key, int[] array){
		int count = 0;
		for (int j : array) {
			if (j == key) count++;
			if (j > key) break;
		}
		return count;
	}
}