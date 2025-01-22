import java.util.*;

public class ArrayspartI {
    public static void update (int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }
    public static int linear_Search(int numbers[] ,int key) {
        for(int i=0; i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    // public static String Linear_Search(String menu[],String chooce){
    //     for(String i=0;i<menu.length;i++){
    //         if (menu[i]== chooce) {
    //             return ;
    //         }
    //     }
    // }
    public static int getLargest(int numbers[]){
        int Largest = Integer.MIN_VALUE; //infinity
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length;i++){
            if(Largest <numbers[i]){
                Largest = numbers[i];
            }
            if(smallest >numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
        return Largest;
    }
    public static int binarySearch(int numbers[] ,int key){
        int start = 0 , end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end)/ 2; 
            
            //comparisons
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid]<key){
                return mid + 1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }
    public static void reverse (int numbers[]){
        int first = 0 , last = numbers.length-1;

        while (first < last) {
            // swap
            int temp = numbers[last];
            numbers[last]= numbers[first];
            numbers[first]=temp;

            first ++;
            last --;
        }
    }
    public static void printPairs(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int curr = numbers[i];//2,4,6,8,10
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" + curr + ","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = "+ tp);
    }
    public static void printSubarrays(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){ //print
                    System.out.print(numbers[k]+" "); //subarrays
                }
                ts ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrys ="+ ts);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t Arrays (Part - I ) \3");
        // Creating an Array 
        /* syntax
         * dataType arrayName[] = new dataType[size];
         */
        // int marks[] = new int[50];

        // int numbers[] = {2,3,4,5,3,4,5,3,4,6,6,7,72,1};
        // int moreNumbers[] = {33,3,5,56,7,7,8,3,2,2,3};
        // String frutes[] = {"apple","banana","mango","orange"};
    
        // array input 
        // int roll_no[] = new int[10];
        // roll_no[0]= 101;
        // roll_no[1]= 102;
        // roll_no[2]= 103;
        // roll_no[3]= 104;
        // roll_no[4]= 105;
        // System.out.println(roll_no[0]);
        // System.out.println(roll_no[1]);
        // System.out.println(roll_no[2]);
        // System.out.println(roll_no[3]);
        // System.out.println(roll_no[4]);
        // roll_no[9] =sc.nextInt();
        // System.out.println(roll_no[9]);

        // roll_no[5]= sc.nextInt();
        // System.out.println(roll_no[5]);

        // int marks[] = new int[40000];
        // marks[0]= sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();
        // marks[3]=sc.nextInt();

        // System.out.println("Array length is = "+marks.length);
        // float percentage = (marks[1]+marks[2]+marks[0]+marks[3]) /4;
        // System.out.println(percentage);
        // String name[]= new String[10];
        // for(int i=0; i<=9;i++){
        //     name[i] = sc.next();
        // }
        // for(int i =0;i<=9;i++){
        //     System.out.println("you are entered name is " + name[i]);
        // }

        // Array as function arguments
            // int marks[] = new int[5];
            
            // for(int i=0;i<5;i++){
            //     marks[i]=sc.nextInt();
            // }
            // for(int i=0;i<5;i++){
            //     System.out.println("orignal marks is = "+marks[i]);
            // }

            // update(marks);
            // for(int i=0;i<5;i++){
            // System.out.println("updated  marks is = "+marks[i]);
            // }

            // Linear search
            // int numbers[] = {2,4,8,10,12,14,16,18,20};
            // int key = 10;
            // int index = linear_Search(numbers, key);
            // if(index == -1){
            //     System.out.println("Not founded");
            // }else{
            //     System.out.println("key is at index : "+index);
            // }

            // String menu[]={"dosa","meagi","cheps","momoje","dokla","pedes"};
            // String chooce = "pedes";
            

            // Largest Number 
            // int numbers[] ={1 , 2 , 6 , 3 , 5 , 10000} ;
            // System.out.println("Largest value is " + getLargest(numbers));

            // Binary Search
            // int numbers[]={2,4,6,8,10,12,14};
            // int key = 14;
            // System.out.println("index for key is : "+ binarySearch(numbers,key));

            // Reverse an array 
                // int numbers[]={2,4,6,8,10};
                // reverse(numbers);
                // //print
                // for(int i=0;i<numbers.length;i++){
                //     System.out.print(numbers[i]+" ");
                // }
                // System.out.println();

            // Pairs in an array
                // int numbers[]={2,4,6,8,10};
                // printPairs(numbers);

            //Print Subarrays
            int numbers[]={2,4,6,8,10};
            printSubarrays(numbers);







        sc.close();
    }
}