import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BinarySearch {
	public static void main(String[] args) {
		long start = System.nanoTime();
		int[] whitelist = In.readInts(args[0]);
		int[] list;
		boolean flag =true;
		if (args.length>2){
			if (args[1].equals("-")){
				flag = false;
			}
			list = In.readInts(args[2]);
		} else {
			list = In.readInts(args[1]);
		}

		Arrays.sort(whitelist);
//		IntStream.of(whitelist).limit(3).forEach(System.out::println);
		System.out.println(whitelist.length);
		whitelist = IntStream.of(whitelist).distinct().toArray();
//		IntStream.of(whitelist).limit(3).forEach(System.out::println);
		System.out.println(whitelist.length);

		int amountPlus = 0;
		int amountMinus = 0;
		int length = list.length;
		for (int i = 0; i < length; i++) {
			int key = list[i];
			if (flag){
				if (rank(key,whitelist)<0){
//					StdOut.println(key);
					amountPlus++;
				}
			} else {
				if (rank(key,whitelist)>=0) {
//				StdOut.println(key);
					amountMinus++;
				}
			}
		}

		System.out.println(Math.max(amountPlus,amountMinus));
		long end = System.nanoTime();
		System.out.println((end-start)/1000000);
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
}