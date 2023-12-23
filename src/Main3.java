import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        for (int i = 0; i < 100; i++) {
            if (i==99){
                System.out.print(printingR(start,end));
            }else {
                System.out.println(printingR(start,end));
            }
        }
    }

    public static int printingR (int start, int end){
        return new Random().nextInt(start,end);
    }
}