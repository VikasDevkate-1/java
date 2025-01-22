import java.util.*;
public class RecursionBasicspI {
    public static void printNoDecreasingorder(int n  ){
        if(n ==  1000 ){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printNoDecreasingorder(n+1);
    }
    public static int factorial(int n ){
        if(n == 0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n * factorial(n-1);
        return fn;
    }
    public static void decreasingOrder(int n ){
        if(n ==1){
            System.out.println( n);
            return;
        }
        System.out.print(n + " ");
        decreasingOrder( n - 1);
    }
    public static void increasingOrder(int n ){
        if(n == 1 ){
            System.out.println(n);
            return;
        }
        increasingOrder(n-1);
        System.out.println(n);
    }
    public static int sum(int n ){
        if(n == 1){

            return 1;
        }
        int snm1 = sum(n-1);
        int sumn = n + snm1;
        return sumn;
    }
    // calculate nth term in fibonacci
    public static int fib(int n ){
        if(n == 0 || n == 1){
            return n ; 
        }
        int f1 = fib(n -1);
        int f2 = fib(n-2);
        return f1 + f2;
    }
    public static boolean isSorted (int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr , i+1 );
    }
    public static int firstOccurence(int arr[],int key,int i ){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i ;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static int lastOccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static int power(int x,int n ){
        if(n == 0){
            return 1;
        }
        // int xnm1 = power(x,n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x,n-1);
    }
    public static int optimizedPower(int a, int n){
        if(n == 0 ){
            return 1;
        }
        
        // int halfPowerSq = optimizedPower(a, n/2)* optimizedPower(a, n/2);
        // or 
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // printNoDecreasingorder(n);
        // decreasingOrder(n);
        // problem 2 
        // increasingOrder(n);
        // Problem 3 factorial 
        // System.out.println(factorial(n));
        // Problem 4 Print sum of first n natural numbers.
        // System.out.println(sum(n));
        // Problem 5 Print nth fibonacci number.
        // System.out.println(fib(n));
        // problem 6 Check if a  given array is sorted or not 
        // int arr[]={1,2,3,4,5,6};
        // System.out.println(isSorted(arr, 0));
        // problem 7 WAF to find the first occurence of an element in an array.
        // int arr[]={8,3,6,9,5,10,2,5,3};
        // System.out.println(firstOccurence(arr, 05, 0));
        // problem 8 WAF to find the last occurence of an element in an array
        // int arr[]={8,3,6,9,5,10,2,5,3};
        // System.out.println(lastOccurence(arr, 5, 0));
        // problem 9  Print x^n 
        // System.out.println(power(2,30));
        // sc.close();
        // problem 10  Print x^n in O(logn)
        System.out.println(optimizedPower(2 ,3));
    }
}
