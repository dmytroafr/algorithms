import java.util.Arrays;

public class SelectingSort {
    
    public static int[] selectingSort(int[] array){

        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
        
    }


    public static void main(String[] args) {
        int[] nums = {5,7,2,3,9,1,4,8,6};
        System.out.println(Arrays.toString(selectingSort(nums)));
    }
}
