import java.util.*;
public class PatternII {
    public static void hollow_rectangle (int total_rows , int total_cols ){
//  error       // // outer loop
        // for(int i= 1 ; i<total_rows; i++){
        //     // inner - columns
        //     for(int j = 1 ; j<total_cols; j ++){
        //         // cell -(i , j)
        //         if(i == 1 || i == total_rows || j == 1 || j == total_cols){
        //         // boundary cells
        //         System.out.println("*");
        //         } else {
        //         System.out.print();
        //         }
        //     } 
        
        // System.out.println();


        //outer loop
        for(int i=1; i<=total_rows;i++){
            //inner loop columns
            for(int j=1; j<=total_cols; j++){
                //cell - (i , j)
                if (i == 1 || i == total_rows || j== 1 || j == total_cols) {
                    // boundary cells
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_rotated_half_pyramid(int n ){
        //outer loop
        for(int i = 1; i<=n; i++){
            //spaces
            for (int j = 1; j <= n-1; j++) {
                System.out.print(" ");
            }

            // stars 
            for(int j = 1; j <= i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Inverted_half_pyramid_with_number(int n){
        // outer loop 
        for(int i = 1; i <=n; i ++){
            // inner loop
            for(int no = 1 ; no <= n - i + 1; no++){
                System.out.print(no);
            }
            System.out.println();
        }
    }
    public static void Floyd_triangle (int n){
        int counter =1;
        // outer loop 
        for(int i = 1 ; i<=n; i++){
            //inner loop  how many times will counter be printed 
            for(int j = 1; j<=i; j++){
                System.out.print(counter +"\t");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i;j++){
                if((i+j)%2 == 0){ //even
                    System.out.print("1");
                } else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void BUTTERFLY_pattern(int n){
        // first half
        for(int i=1; i<=n;i++){
            // stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // spaces
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Second half
        // stars - i
            for(int i=n; i>=1;i--){
                for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // spaces
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

            }
    }
    public static void hollow_rhombus(int n){
        for(int i=1; i<=n;i++){
            //spaces
            for(int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }

            //hollo rectangle- stars
            for(int j=1;j<=n;j++){
                if(i ==1 ||i ==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond (int n ){
        // first half 
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1;i--){

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t\t Patterns (part II) - Advanced \3");

        // print Hollow rectangle pattern 
        // hollow_rectangle(5, 5);
        // INVERTED & ROTATED HALF - PYRAMID
        // inverted_rotated_half_pyramid(10);
        // Inverted half pyramid with numbers
        // int a = sc.nextInt();
        // Inverted_half_pyramid_with_number(a);
        // int no = sc.nextInt();
        // Floyd_triangle(no);
        // int n = sc.nextInt();
        // zero_one_triangle(n);
        // BUTTERFLY Pattern
        // int n = sc.nextInt();
        // BUTTERFLY_pattern(n);
        // int n = sc.nextInt();
        // hollow_rhombus(n);
        diamond(10);





        sc.close();
    }
}
