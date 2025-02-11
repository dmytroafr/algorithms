class Solution {
    public static String longestCommonPrefix(String[] strs) {
        
        // String comm = strs[0];
        // for(int j = 1; j < strs.length; j++){
        //     if(comm.length() == 0 || strs[j].length()==0) return "";

        //     if(strs[j].length()>=comm.length() && comm.equals(strs[j].substring(0,strs[j].length()-1))) continue;



        //     for (int i = 0; i < comm.length(); i++){
        //         if(strs[j].length() == i){
        //             comm = strs[j];
        //             break;
        //         }
        //         if (strs[j].charAt(i) != comm.charAt(i)) {
        //             comm = strs[j].substring(0, i);
        //         }
        //     }

        // }
        // return comm;
        String comm = strs[0];
    
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(comm) != 0) {  
                comm = comm.substring(0, comm.length() - 1);
                if (comm.isEmpty()) return "";
            }
        }
        return comm;

    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String[] str2 = {"ab", "a"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(str2));
    }
}