import java.util.*;
public class RecursionBasicspII {
    public static int tilingProblem(int n){// 2 * n (floor size)
        
        // base case
        if(n == 0 || n ==1){
            return 1;
        }
        // kamm
        // vertically choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int total_Ways = fnm1 + fnm2;
        return total_Ways;
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newstr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            // duplicate 
            removeDuplicates(str, idx + 1, newstr, map);
        }else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newstr.append(currChar), map);
        }

    }
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        // choice
        // single
        // int fnm1 = friendsPairing(n-1);

        // // pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1) * fnm2;

        // // total ways 
        // int total_ways = fnm1 + pairWays;
        // return total_ways;

        
        return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
    }
    public static void printBinString(int n ,int lasPlace, String str ){
        // base case
        if(n == 0 ){
            System.out.println(str);
            return;
        }
        // kaam
        // if(lastPlace == 0){
        //     // str.append("0");

        //     // sit 0 on chair n 
        //     printBinString(n-1,0, str.append("0"));
        //     printBinString(n-1, 1, str.append("1"));
        // } else {
        //     printBinString(n-1, lasPlace 0, str.append("0"));
        // }

        printBinString(n-1, 0, str+"0");
        if(lasPlace == 0 ){
            printBinString(n-1,  1, str+"1");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t\t Recursion Basics (part - II) \t\3");

        /* Problem 11
         * Tiling Problem
         * Given a "2*n" board and tiles of size "2*1",count the number of ways to tile the given board using the 2*1 tiles.
         * (A tile can either be placed horizontally or vertically.)
         */
        // int n = sc.nextInt();
        // System.out.println(tilingProblem(n));

        /*Problem 12
         * Remove Duplicates in a String                (Google , Ameazon)
         * "appnnacollege"            
         */
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        /* Problem 13
         * Friends Pairing Problem
         * Given n friends , each one can remain single or can be paired up with some other friend. Each fried can be paired only once. 
         * Find out the total number of ways in which friends can remain single or can be paired up .         (Goldman Sachs)
         */
        // System.out.println(friendsPairing(3));
        /* Problem 14 
         * Binary String Problem
         * Print all binary strings of size N without consecutive ones.                                         (Paytm)
         * 
         */
        printBinString(3, 0 , "");

        sc.close();
    }
}
