package Functions;

import java.util.Scanner;

public class Multiply {
    public static int calculateMul(int a ,int b){
        // int multi= a*b;
        return a*b;

    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b= sc.nextInt();

         int multi = calculateMul(a, b);
         System.out.println("Multiply of 2 numbers is : "+multi);
    }
}
