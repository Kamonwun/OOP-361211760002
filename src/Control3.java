package  lab3;

import java.util.Scanner;

public  class  Control3 {

    public  static void  main (String[] args) {
        //if-else-if -> เป็นสิ่งที่มีการทดสอบหลายเงื่อนไข เงื่อนไขใดเป็นจริงจะทำอย่างที่คำสั่งนั้นเพียงคำสั่งเดียว
        //ในกรณีที่เงื่อนไขทั้งหมดเป็นเท็จ จะทำงานที่คำสั่ง else
        //โครงสร้างคำสั่ง if-else-if
        //if(เงื่อนไข 1){
        //      คำสั่งเมื่อเงื่อนที่ 1 เป็นจริง;
        // }else if(เงื่อนไข 2){
}       //      คำสั่งเมื่อเงื่อนที่ 2 เป็นจริง;
        //}else if(เงื่อนไขmที่ n){
        //      คำสั่งเมื่อเงื่อนที่ 3 เป็นจริง;
        //}else{
        //}

        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you? :");
        int age = sc.nextByte();

        //
        if (age<20){
            System.out.println("You are young.");
        }else if (age<=60){
            System.out.println("You are teenager.");
        }else{
            System.out.println("You are old.");
        }