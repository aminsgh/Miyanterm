import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      //  while (getStrinFromInput()=="exit");
        System.out.print("/"+"\n"+"4");

    }
    public static String getStrinFromInput(){
        String input;
        Scanner scanner=new Scanner(System.in);
        input= scanner.nextLine();
        return input;
    }
    public static int getIntFromInput(){
        int input;
        Scanner scanner=new Scanner(System.in);
        input=scanner.nextInt();
        return input;
    }
}
