package Assignment03;

import java.util.Scanner;

public class Pro4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=10;
        double d=i;
        float f=i;
       // boolean b=(boolean)i; //Error
        String str=Integer.toString(i); // Error

        
        System.out.println(i);
        System.out.println(d);
        System.out.println(f);
        System.out.println(str);
    }
}
