package lab3;

public  class LoopFor {

    public  static  void  main(String[] args) {

        //loop for : ใช้ในกรณีทราบขจำนวนที่ชัดเจน
        //โครงสร้าง for


        //for (ค่าริ่มต้น; เงื่อนไข; ปรับปรุงค่า)
        //}

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello.");
            if (i%2 ==0)
                System.out.println("RUTS");
        }
    }
}
