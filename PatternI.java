import java.util.*;
public class PatternI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                                                                    // // Print Star pattern 
        // int n = sc.nextInt();
        // for(int line = 1 ; line <= n; line++){
        //     for(int st = 1 ; st <= line; st++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

                                                                    // //inverted Star pattern

        // int n = sc.nextInt();

        // for(int line = 1 ; line <=n ; line++){
        //     for(int str = 1 ; str <= n - line + 1; str ++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //                                                             //Print Half pyramid pattern 
        // int n = sc.nextInt();
        // for(int line = 1 ; line <= n ; line ++){
        //     for(int no = 1 ; no <=line ; no ++){
        //         System.out.print(no);
                
        //     }
        //     System.out.println();
        // }

                                                                    //Print Character pattern
        int n = sc.nextInt();

        char ch = 'A';
        for(int line = 0 ; line <= n ; line++){
            for(int Chars = 0; Chars <= line; Chars++){
                System.out.print(ch);
                ch ++;
            }
            System.out.println();
        }

        sc.close();
    }
}
