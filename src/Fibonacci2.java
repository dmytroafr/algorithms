public class Fibonacci2 {
    public static long F (int N){
        if (N==0) return 0;
        if (N==1) return 1;
        return F(N-1) + F(N-2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " " + F(i));
        }
    }
}
