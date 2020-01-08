package lab3;

import java.util.Scanner;

public class LoopDoWhile {

    public  static void main(String[] args) {
        //do-while -> ทำงานเช่นเดียวกับ While แต่จะทำคำสั่งในลูปก่อน 1 ครั้งจึงทดสอบเงื่อนไข
        //ดั้งนั้นจะหมายความหมายว่า ไม่ว่าเงื่อนไขเป็นจริงหรือเท็จ คำสั่งในลูปก่อน 1 ครั้ง

        //do
        //  คำสั่งเมื่อเงื่อนไขเป็นจริง;
        //}ไ้รสำ (เงื่อนไข);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter an number: ");
            X = sc.nextInt();
        }while (x !=0);
        System.out.println("Good dye");
    }
