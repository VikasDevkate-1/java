import java.util.*;
public class Fucnctionandmethods {
    
    public static int multiply (int a , int b ){
        int multiply = a * b ; 
        return multiply;
    }
    public static void swap (int a , int b){
        // swap 
        int temp = a; 
        a = b ;
        b = temp;
        System.out.println("a is "+ a );
        System.out.println("b is "+ b);
    }
    // public static int sum (int a , int b ){ // parameter or formal parameter 
    //     int sum = a + b;
    //     // int sum = x + y ; 
    //     return sum ; 
    // }
    public static void helloworld(){
        for(int hello = 1 ; hello <= 10 ; hello ++){
        System.out.println("hello world ");
        }
        System.out.println("hello world ");
    }
    public static void first(){
        for(int a = 0 ; a <= 10; a ++){
            System.out.println("I \3 you");
        }
    }
    public static int factorial (int a){
        int fc = 1 ; 
        for(int i = 1 ; i <= a ; i ++){
            fc *= i;
        }
        return fc;
    }
    public static int binCoeff(int n , int r ){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r );
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
public static int sum (int a , int b ){
    return a + b ; 
}
public static float sum (float a, float b ){
    return a + b;
}
public static double sum (double a, double b){
    return a + b; 
}
public static int sum (int a , int b , int c){
    return a + b + c ;
}
// only for n >= 1
// public static boolean isPrime ( int n){
//     // corner cases 
//     //2
//     if(n == 2){
//         return true;
//     }
//     boolean isPrime = true;
//     for(int i = 2 ; i <= n; i++){ 
//         if (n % 2 == 0) {// completely dividing 
//             isPrime = false;
//         }
//     }
//     return isPrime;
// }

public static boolean isPrime (int n){
    if(n == 2 ){
        return true; 
    }
    for(int i = 2 ; i <= Math.sqrt(n); i++){
        if(n % i == 0 ){
            return false;
        }
    }
    return true;
}
public static void primeInRange(int n  ){
    for(int i = 2 ; i <= n ; i ++){
        if(isPrime(i)){// true
            System.out.print(i + "\t");
        }
    }
    System.out.println();
}
public static void binToDec(int binNUm){
    int myNum = binNUm;
    int pow = 0 ; 
    int decNum = 0 ; 
    while (binNUm > 0) {
        int lastDigit = binNUm % 10 ; 
        decNum = decNum +(lastDigit * (int) Math.pow(2, pow));

        pow ++ ; 
        binNUm  = binNUm/ 10 ; 
    }
    System.out.println("decimal of "+ myNum + " " + decNum);
}
public static void decToBin(int n){
    int myNum = n;
    int pow = 0 ; 
    int binNum = 0 ; 
    while (n > 0) {
        int rem = n % 2 ; 
        binNum = binNum + (rem * (int)Math.pow(10 ,pow));
        pow ++;
        n = n / 2;
    }
    System.out.println("binary form of " + myNum + " = " + binNum);
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" \t \t \t Function and Methods : \3");
        // first();
        // helloworld();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = sum(a , b); // actual parameter or arguments
        // System.out.println("sum is = " + sum);
        // swap - values exchange 
        // int x = sc.nextInt(); 
        // int y = sc.nextInt();
        // swap(x, y);
        // System.out.println("x = "+ x);
        // System.out.println("y = "+ y);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("Product of a and b is " + multiply(a, b));
        // Find factorial
        // int  fc = sc.nextInt();
        // System.out.println(factorial(fc));
        // Binomial coefficient
        // System.out.println(binCoeff(a,b));
        // Function overloading // Multiple functions with the same name but different parameters
        // int a = sc.nextDouble();
        // double b = sc.nextDouble();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int  c = sc.nextInt();
        // // float a = sc.nextFloat();
        // // float b = sc.nextFloat();
        // System.out.println(sum(a, b ,c));
        // System.out.println(sum(a , b ));
        // // function overloading using data types 
        // System.out.println("using int data type perform function overloading : " + sum(33, 80));
        // System.out.println("using float data type perform function overloading : " + sum(3.14f, 9.12f));
        // System.out.println("using double data type perform function overloading : " + sum(12321, 24) );
        // Check if a number is prime or not 
        // System.out.println(isPrime(2));
        // check prime optimized
        // System.out.println(isPrime(10));
        // print all Primes in the range
        // int a = sc.nextInt();
        // primeInRange(a);
        // convert from Binary to Decimal
        // binToDec(1111);
        // convert from decimal to binary 
        // decToBin(100);
        // method scope
        // System.out.println(a);
        // int a ;
        // System.out.println(a);
        // Block scope 
        // {
        //     int b = 3 ; 
        // }
        // System.out.println(b);



        sc.close();
    }
}
