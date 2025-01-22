import java.util.*;

public class vikas {
    public static float product(float a , float b ){ // parameters or formal parameter 
        
        float product = a * b ;
        return product;

    }

    public static int sum(int a , int b){
        int sum = a + b ; 
        return sum;
    }

    public static void helloworld(){
        System.out.println("hello world ");
        System.out.println("hello world \n \n \n \n \n ");

        // System.out.println(sum(7, 7));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Functions / Methods");

        // helloworld(); // function call 

        // int sum = sum(19, 20); // arguments or actual parameter
        // System.out.println(sum);
        // float x = sc.nextFloat();
        // float y = sc.nextFloat();
        // System.out.println(product(x , y));  

        
        


        sc.close();
    }
}
