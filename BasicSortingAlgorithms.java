import java.util.*;
// import java.util.Arrays;
public class BasicSortingAlgorithms {




    // public static void BubbleSort(int arr[]){
    //     for(int turns=0;turns<arr.length -1;turns++){
    //         for(int j=0;j<arr.length-1-turns;j++){
    //             if(arr[j]>arr[j+1]){
    //                 //Swap
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;

    //             }
    //         }
    //     }
    // }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // public static void selectionSort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         int minPos = i;
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[minPos]<arr[j]){
    //                 minPos = j;
    //             }
    //         }
    //         // Swap
    //         int temp =arr[minPos];
    //         arr[minPos] = arr[i];
    //         arr[i]= temp;
    //     }
    // }
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length;i++){
            int curr = arr[i] ;
            int prev = i-1;
            //finding out the correct pos to insert
            while (prev >=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
    }
    
    public static int compare(int a, int b){
        // a < b -ve
        // a > b +ve
        // a == b 0
        return a -b ;
    }
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting 
        int j = 0;
        for(int i=0; i<count.length;i++){
            while (count[i] >  0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t BasicSortingAlgorithms.java \3");

        // // Bubble Sort 
        // int arr[] = {5 , 4 , 1 , 3 , 2};
        // BubbleSort(arr);
        // printArr(arr);

        // Selection Sort
        // int arr[] = {5 , 4 , 1 , 3 ,2};
        // selectionSort(arr);
        // printArr(arr);

        // // Insertion Sort
        // int arr[] = {5 , 4 , 1 , 3 ,2};
        // insertionSort(arr);
        // printArr(arr);

        // Inbuilt Sort
        // Integer arr[]={5,4,1,3,2};
        // Arrays.sort(arr,0,5);
        // printArr(arr);
        //  Or 

        // Arrays.sort(arr);
        // printArr(arr);

        // Syntax Arrays.sort(arr,si,ei);
            // Arrays.sort(arr,0,arr.length);
            // printArr(arr);
        /*
         * import java.util.*;
         * Arrays.sort(arr.Collections.reverseOrder())
         * 
         * Arrays.sort(arr.si,ei,Collections.reverseOrder())
         */
        // Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr,0,5,Collections.reverseOrder());
        // printArr(arr);

        // Counting Sort 
        // 1 , 4 , 1 ,3 ,2 ,4,3,7
        int arr[]={1 , 4 , 1 ,3 ,2 ,4,3,7};
        countingSort(arr);
        printArr(arr);





        sc.close();
    }

    // private static void printArr(int[] arr) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'printArr'");
    // }

    
}
