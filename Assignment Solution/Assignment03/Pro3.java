package Assignment03;

import java.util.Scanner;

public class Pro3 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter double value");
        double d=sc.nextDouble();
        System.out.println("enter float value");
        float f=sc.nextFloat();
        int ans=(int)(d+f);
        System.out.println("ans is in int is "+ans);
    }
}
