import java.util.*;
public class ArrayspartII {
    // public static void printSubarrays(int numbers[]){
    //     int currSum =0;
    //     int maxSum= Integer.MIN_VALUE;

    //     // int ts=0;
    //     for(int i=0;i<numbers.length;i++){
    //         int start = i;
    //         for(int j=i;j<numbers.length;j++){
    //             int end=j;
    //             currSum=0;
    //             for(int k=start;k<=end;k++){ //print
    //                 currSum+=numbers[k];
    //                 // System.out.print(numbers[k]+" "); //subarrays
    //             }

    //             // ts ++;
    //             if(maxSum<currSum){
    //                 maxSum=currSum;
    //             }
    //             // System.out.println();
    //         }
    //         // System.out.println();//
    //     }
    //     // System.out.println("total subarrys ="+ ts);
    //     System.out.println("max sum = " + maxSum);
    // }
    public static void printSubarrays(int numbers[]){
        
        int currSum = 0 ;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];

        prefix[0]= numbers[0];
        //calculate prefix array
        for(int i=1; i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=1;j<numbers.length;j++){
                int end=j;
                currSum= start == 0 ? prefix[end]: prefix[end]-prefix[start -1];

                if (maxSum<currSum) {
                    maxSum = currSum;
                }
            }
        }
    System.out.println("max sum = "+maxSum);
    }
    public static void kadanes(int numbers[]){

        int ms= Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<numbers.length;i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs=0;

            }
            ms = Math.max(cs,ms);

        }
        System.out.println("our max subarray sum is : " + ms);
    }

    public static int trappedRainWater(int height[]){
        int n = height.length;
        //calculate left max boundary -array
        int leftmax[] = new int[n];
        leftmax[0]= height[0];
        for(int i=1; i<n;i++){
            leftmax[i] =Math.max(height[i],leftmax[i-1]);
        }
        //calculate right max boundary -array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n -1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0;i<n;i++){
            //waterlevel = min(leftmax bound, rightmax bound)-
            int waterLevel = Math.min(leftmax[i],rightmax[i]);

            //trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){ // Profit
                int profit = prices[i] - buyPrice;// today's profit
                maxProfit = Math.max(maxProfit,profit);
            }   else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t\t Arrays part (II) \3");
        //Print Subarrays
        // int numbers[]={2,4,6,8,10};
        // printSubarrays(numbers);
        
        // Max Subarray sum 
        // int numbers[]={1,-2,6,-1,3};
        // printSubarrays(numbers);

        // int numbers[]= {-2,-3,4,-1,-2,1,5,-1};
        // kadanes(numbers);


        // Trapping Rainwater-code 
        // int height[]={4,2,0,6,3,2,5};
        // System.out.println(trappedRainWater(height));

        // Buy & Sell 
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));


        sc.close();
    }
}
