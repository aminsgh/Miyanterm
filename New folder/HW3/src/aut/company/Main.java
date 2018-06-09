package aut.company;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


         Employee nunber1=new Employee("amin","sadegh",25,"amin","sadegh");
         Employee nunber2=new Employee("hasan","dd",40);
         Employee nunber3=new Employee("gholi","gholami",29);

         Employee nunber4=new Employee("ali","sadegh",25,"ali","sadegh");
         Employee nunber5=new Employee("taghi","dd",40);
         Employee nunber6=new Employee("abas","gholami",29);


         Insurance insurance1=new Insurance("IranInsuramce");
         Insurance insurance2=new Insurance("AsiyaInsuramce");

         insurance1.register(nunber1);
         insurance1.register(nunber2);
         insurance1.register(nunber3);
         insurance2.register(nunber4);
         insurance2.register(nunber5);
         insurance2.register(nunber6);


      /**   //car tag class
         CarTag myTag=new CarTag("9531421","MohammadAMin","Sadegh");
         myTag.addAndCheckFine("fine1");
         myTag.addAndCheckFine("fine2");
         myTag.addAndCheckFine("fine3");
         myTag.addAndCheckFine("fine4");
         myTag.addAndCheckFine("fine5");
         myTag.addAndCheckFine("fine6");
         myTag.printFine();
         System.out.println(myTag.isRegistered()+"");
         System.out.println("//////////////////////");
         myTag.clearAndCheckFine("fine6");
         myTag.clearAndCheckFine("fine3");
         myTag.printFine();
         System.out.println(myTag.isRegistered()+"");
         // end car tag
*/

    }
}
