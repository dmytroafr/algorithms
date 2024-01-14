import java.util.Arrays;
public class Sort26 {
	public static void main(String[] args) {
		int [] ourArray = new int[3];
		ourArray[0] = 7;
		ourArray[1] = 8;
		ourArray[2] = 4;
		sorting(ourArray);
		System.out.println(Arrays.toString(ourArray));
	}
	public static void sorting (int[] array){
		int t;
		if (array[0]>array[1]) {
			t = array[0];
			array[0] = array[1];
			array[1] = t;
		}
		if (array[0]>array[2]){
			t = array[0];
			array[0] = array[2];
			array[2] = t;
		}
		if (array[1]>array[2]){
			t = array[1];
			array[1] = array[2];
			array[2] = t;
		}
	}
}