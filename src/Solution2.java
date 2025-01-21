public class Solution2 {
    
    public static int mySqrt(int x) {

        // for (int i = 1; i <= (x/2+1); i++){
        //     if (i > 46340){
        //         return i-1;
        //     }
        //     int y = i * i;
        //     if (y == x) {
        //         return i;
        //     } else if (y > x ){
        //         return i-1;
        //     }
        // }
        // return 0;
        // if (x == 0) return 0;

    long r = x;
    while (r * r > x) {
        r = (r + x / r) / 2;
    }
    return (int) r;

    }
    public static void main(String[] args) {
     
        int result = mySqrt(1);
        System.out.println(result);
    }
}
