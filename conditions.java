package basics;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int x = sc.nextInt();
        // int y = sc.nextInt();

        // if(x==y){
        // System.out.println("Equal");
        // }else if(x > y){
        // System.out.println("x is greater");
        // }else{
        // System.out.println("x is lesser");
        // }

        // if(x==y){
        // System.out.println("Equal");
        // }else{
        // if(x>y){
        // System.out.println("x is greater");
        // }else{
        // System.out.println("x is lesser");
        // }
        // }
        // if(age >=18){
        // System.out.println("Adult");
        // }else{
        // System.out.println("Not Adult");
        // }

        // if(x%2==0){
        // System.out.println("Even");
        // }else{
        // System.out.println("Odd");
        // }

        int button = sc.nextInt();

        // if(button ==1){
        // System.out.println("Hello");;
        // }else if(button ==2){
        // System.out.println("Namaste");
        // }else if(button ==3){
        // System.out.println("ka hal ba");
        // }else{
        // System.out.println("Inavalid button");
        // }

        switch (button) {
            case 1:
                System.out.println("hello");
                break;

            case 2:
                System.out.println("Namsaste");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Invalid button4");
                break;
        }

    }
}
