package lad7;

public class Dog {
    //Attributes
    private String name;
    private int age;
    private String hairColor;

    //
    //
    public Dog (){}
    //
    public Dog (String name,int age,String hairColor){
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;


    }
    //Behavior คือ
    public void barkintln(){
       System.out.println("Dog barking");
    }
    private void sleeping(){
        System.out.println("Dog sleeping");
    }
    private void eating(){
        System.out.println("Dog eating");
    }
    //getter and Setter methods ใช้สำหรับการอ่านค่าและปรับปรุงข้อมูลใน attributes ขแงคลาส
    // getter ใช้อ่านข้อมูล
    // Setter ใช้ปรับปรุงหรือเปลี่ยนแปลงข้อมูล
    public String getName (){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge (){
        return this.age;
    }
    public String getHairColor(){
        return this.hairColor;
    }
    public void setHairColor(String hairColor){
        this.name = hairColor;
    }

}//class
