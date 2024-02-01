import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {

    Scanner inputScan = new Scanner(System.in);
    System.out.println("enter your age");
    int age = inputScan.nextInt();
    int pageNo = 100 - age;
    System.out.println( age + "year olds should read " + pageNo + " pages before giving up on a book");;
    }
}
