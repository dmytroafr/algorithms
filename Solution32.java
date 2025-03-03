import java.util.BitSet;

public class Solution32 {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();
        String b = Integer.toUnsignedString(n);
        for (int i = 0; i < 32; i++){
            if(b.charAt(i)=='1') {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        int unsignedInt = Integer.parseUnsignedInt(sb.toString());
        return unsignedInt;
    }
    public static void main(String[] args) {
        int unsignedInt = Integer.parseUnsignedInt("00000010100101000001111010011100");
        System.out.println(reverseBits(unsignedInt));
    }
}
