public class GCD {
	public static void main(String[] args) {
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		int result = gcd(Math.max(first,second),Math.min(first,second));
		System.out.println(result);
	}
	public static int gcd (int bigger, int smaller){
		if (smaller==0) return bigger;
		int newSmaller = bigger%smaller;
		System.out.printf("%d %d\n",smaller,newSmaller);
		return gcd(smaller,newSmaller);
	}
}
