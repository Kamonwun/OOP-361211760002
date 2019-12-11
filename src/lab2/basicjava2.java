package lab2;

import  java.util.Scanner;

public class basicjava2 {
    public  static void  main (String [] args) {
        //input
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter your name:  ");
        String name = sc.nextLine();
        System.out.println("Your name is "+name);

        System.out.println("Enter your age:  ");
        String age = sc.nextLine();
        System.out.println("Your age is "+age);


       System.out.println("Enter your email:  ");
       String email = sc.nextLine();
       System.out.println("Your name is "+email);
       System.out.println("Your name is "+name+"Your email is  "+email);

        //input integer and floating
        System.out.println("Enter an number: ");
        int num = sc.nextInt();
        System.out.println("Your entered number: "+num);

        System.out.println("Enter an number: ");
        double d = sc.nextDouble();
        System.out.println(d);


    }
}//class
