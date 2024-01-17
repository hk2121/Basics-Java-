package Functions;

import java.util.Scanner;

public class Average {
     
    // public static float printAvg(float a,float b,float c){
    //     float average= (a+b+c)/3;
    //     return average;
    // }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          float a = sc.nextInt();
          float b = sc.nextInt();
          float c = sc.nextInt();

          float average = (a+b+c)/3;
          System.out.println(average);
    }
}
