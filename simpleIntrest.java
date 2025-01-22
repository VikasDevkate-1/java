import java.util.*;
public class simpleIntrest {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Principle , Rate , Number for calculating simple interest : ");
        int Principle = sc.nextInt();
        float Rate = sc.nextFloat();
        int Number = sc.nextInt();
        float simpleIntrest = (Principle * Rate * Number)/100;
        System.out.println("Simple Interest is : " + simpleIntrest);



        sc.close();
    }
}