import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.WeakHashMap;


public class Main2 {
    public static void main(String[] args) {
//        Scanner cs = new Scanner(System.in);
//        Scanner cc = new Scanner(args[0]);
//        while (cs.hasNext()){
//            System.out.print(cs.next() + " it is Main2");
//        }
//        int a = 1;
//        if (1>2) a = 0;
//
//        int f = 0;
//        int g = 1;
//        for (int i = 0; i <= 15; i++) {
//            System.out.println(f);
//            f= f+g;
//            g= f-g;
//        }

//        double t = 9.0;
//        while (Math.abs(t - 9.0/t)> .001){
//            t = (9.0/t + t) / 2.0;
//            System.out.printf("%.5f\n",t);
//        }
//
//        int sum = 0;
//        for (int i = 0; i < 1000; i++) {
//            for (int j = 0; j < i; j++) {
//                sum++;
//            }
//        }
//        System.out.println(sum);
//
//        int y = 0;
//        for (int i = 1; i < 1000; i++) {
//            y+=i;
//        }
//        System.out.println(y);

//        int sum = 0;
//        for (int i = 1; i < 1000; i*=2) {
//            for (int j = 0; j < N; j++) {
//
//            }
//        }
//        System.out.println('b');
//        System.out.println('b' + 'c');
//        System.out.println((char) ('a' + 4));
//
//        System.out.println(Integer.toBinaryString(50));
//
//        String s = "";
//        for (int i = 50; i > 0; i/=2) {
//            s = (i%2) + s;
//        }
//        System.out.println(s);
//
//
//        boolean [][] matrix = new boolean[2][40];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = new Random().nextBoolean();
//            }
//        }
//
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println("Row number is " + (i+1));
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j]?"*|":" |");
//            }
//            System.out.println();
//        }
//        matrix = tranpose(matrix);
//
//
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println("Row number is " + (i+1));
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j]?"*|":" |");
//            }
//            System.out.println();
//        }






//        int [] a = new int[10];
//        for (int i = 0; i < 10; i++) {
//         a[i] = 9-i;
//        }
//        System.out.println(Arrays.toString(a));
//        for (int i = 0; i < 10; i++) {
//            a[i] = a[a[i]];
//        }
//        System.out.println(Arrays.toString(a));

        System.out.println(al1_1_14(128));
        System.out.println(Math.pow(2,7));
        int [] test = new int[50];
        for (int i = 0; i < 50; i++) {
            test[i] = new Random().nextInt(0,49);
        }
        System.out.println(Arrays.toString(test));
        int [] newOne = histogram(test, 50);

        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(newOne));
        int sum = 0;
        for (int i:newOne) {
            sum++;
        }
        System.out.println(newOne.length);
        System.out.println(sum);

    }
    public static boolean [][] tranpose (boolean[][] mat){

        boolean[][] result = new boolean[mat[0].length][mat.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                result[i][j] = mat[j][i];
            }
        }
        return result;
    }

    public static int al1_1_14 (int N){
        int count = 0;
        while (N>1){
            N/=2;
            count++;
        }
        return count;
    }

    public static int[] histogram(int[] array, int M){
        int [] result = new int[M];
        for (int j : array) {
            result[j]++;
        }
        return result;
    }


}
