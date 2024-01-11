import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Objects;

public class BinarySearch {
	public static void main(String[] args) {
		int[] whitelist = In.readInts(args[0]);

		boolean flag =true;

		if (args.length>1){
			if (args[1].equals("-")){
				flag = false;
			}
		}




		Arrays.sort(whitelist);
		int amountPlus = 0;
		int amountMinus = 0;

		while (!StdIn.isEmpty()){
			int key = StdIn.readInt();
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