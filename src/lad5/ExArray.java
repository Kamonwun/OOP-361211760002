package lad5;

public class ExArray {

    //Array คือ ตัวแปรชนิดหนึ่ง ที่สามารถเก็บข้อมูลได้หลายข้อมูลในตัวแปร 1 ตัว โดยใช้เลข index ในการระบุตำแหน่งแต่ละตัวข้อมูล เลข index
    //นี้จะเริ่มที่ 0 เสมอ

    public static void main (String[] args){

        int x [] = new int[5];
        //ตัวแปร x สามารถเก็บจำนวนเต็มได้ 5 จำนวน

        System.out.println(x[0]);
        x[3] = 100;
        x[1] = x[0] + x[3];
        x[4] = x[1] * 3;
        x[2] = x[4] * 3;
        x[0] = x[3] * 3;


        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);

        //error
        System.out.println(x[5]);


    }//main

}//class
