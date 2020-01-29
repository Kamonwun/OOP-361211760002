package lad7;

public class DogApp {

    public static void main(String[]args){
        //create object สร้างวัสดุ
        //1.ใช้ default constructor
        Dog dog1 = new Dog();

        dog1.setName("Dang");
        dog1.setName("3");
        dog1.setHairColor("Brow");

        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());
        System.out.println(dog1.getHairColor();


        //2.
        Dog dog2 = new Dog("Dum",10,"Black");
        System.out.println(dog2.getName());
        System.out.println(dog2.getAge());
        System.out.println(dog2.getHairColor());






    }//main
}//class
