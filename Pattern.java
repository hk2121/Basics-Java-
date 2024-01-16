package basics;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        System.out.println("------------------ ");

        System.out.println("*\n**");

        System.out.println("------------------ ");

        // variables
        int a = 10;
        int b = 25;
        int sum = a + b;
        int ans = (a * b) / (a - b);

        System.out.println(sum);
        System.out.println(ans);

        // Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // nextInt()
        // nextFloat()
        System.out.println(name);
    }
}
