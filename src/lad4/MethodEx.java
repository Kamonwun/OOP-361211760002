package lad4;

public class MethodEx {

    //1.No return No parmater : คือ เมธอดที่ไม่มีการรับค่าพารามิเตอร์ และไม่คืนค่าใดกลับจากนั้น procss แล้ว
    //2.No return l or more parameter : คือ เมธอดที่มีการรับค่าพารามิเตอร์
    //3.Return l value, l or more parameter : คือ เมธอดที่มีการรับพารามิเตอร์ตั้งแต่ 1 หรือมากกว่า และ มีการคืนค่ากลับไปส่วรที่เรียกใช้งาน (เรียกใช้จาก
    // ที่ไหน คืนค่าไปที่นั้น)
    public static void main(String[] args) {

        System.out.println("Hello from Main ().");
        //calling method A ()
        A();
        A();
        A();
        //calling method B ()
        B("MIT","RUST");
        //calling method c ()
        //1.ประกาศตัวแปรชนิดเดียวกันมาเก็บค่ามราเมธอดส่งกลับมาให้
        int summation = C (10,20);
        System.out.println("The summation of x and y:"+summation);
        //2.เรียกใช้
        System.out.println("The summation of x and y (2):"+C(50,50,));
    }//main

    public static void A () {
        System.out.println("Hello from A().");
    }//A
    public  static void B(String msg, String msg2){
        System.out.println("Hello from B().");
        System.out.println("Message: "+msg);
        System.out.println("Message2:+msg2");

    }//B
    public static int C(int x, int y){
        System.out.println("Hello from C ().");
        int sum = x + y;
        return sum;

    }
}//class


