import java.util.Arrays;

public class Solution28 {
    public static int hIndex(int[] citations) {
        
        Arrays.sort(citations);

        int result = citations.length;
        int index = 0;
        while (citations[index] < result) {
            result--;
            if (result != 0) {
                index++;
            }
        }

        return result;

        // int n = citations.length;
        // for(int i = 0; i < n; i++){
        //     int h = n - 1;
        //     if (citations[i] >= h) {
        //         return h;
        //     }
        // }

        // return 0;
    }

    public static void main(String[] args) {

        int[] citations = {1,3,1};
        System.out.println(hIndex(citations));
    }
}
