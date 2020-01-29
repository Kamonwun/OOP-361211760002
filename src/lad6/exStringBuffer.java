package lad6;

import java.util.StringTokenizer;

public class exStringBuffer {
    public static void main (String[]args){

        //StringBuffer เป็นคลาส ที่มีเมธอดต่างๆ ที่สามารถปรับปรุงแก้ไขข้อมูลที่เป็น String ได้มากกว่าคลาส String ทั่วไป

        StringBuffer strBuf = new StringBuffer("hello");
        System.out.println(strBuf);
        //
       strBuf.append("Saiyai");
       System.out.println(strBuf);
       System.out.println(strBuf.reverse());
       strBuf.delete(0,6);
       System.out.println(strBuf);

        //
        String s = "Coronaviruses are zoonotic, meaning they are transmitted between animals and people. " +
                " Detailed investigations found that SARS-CoV was transmitted from civet " +
                "cats to humans and MERS-CoV from dromedary camels to humans. " +
                "Several known coronaviruses are circulating in animals that have not yet infected humans. ";

        StringTokenizer tokenizer = new StringTokenizer(s);
        int CountWord = tokenizer.countTokens();
        System.out.println("Word count from message: "+CountWord);

        //
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }

    }//main
}//class
