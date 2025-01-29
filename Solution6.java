
class Solution6 {
    public static int romanToInt(String s) {

        int sum = 0;
        int current = 0;
        for(int i=s.length()-1 ; i>=0 ; i--){
            
            current = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };

            if (current * 4 < sum){
                sum -= current;
            } else{
                sum += current;
            }

        }
        return sum;

        
        // Map<Character, Integer> numbers = Map.of(
        //     'I', 1,
        //     'V', 5,
        //     'X', 10,
        //     'L', 50,
        //     'C', 100,
        //     'D', 500,
        //     'M', 1000);

        // int sum = 0;
        // for(int i = 0; i < s.length(); i++){
        //     int current = numbers.get(s.charAt(i));
        //     if(i < s.length()-1 && current < numbers.get(s.charAt(i+1))){
        //         sum -= current;
        //     } else{
        //         sum += current;
        //     }
        // }
        // return sum;
    }
    public static void main(String[] args) {
        
        String s = "MCMXCIV";
        int result = romanToInt(s);

        System.out.println(result);
    }
}