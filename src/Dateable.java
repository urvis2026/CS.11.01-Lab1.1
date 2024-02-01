import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter your age");
        int age = scan.nextInt();
        System.out.println(age);
        int num = (int)age / 2 + 7;
        System.out.println("A person of your age should date someone of age " + num + " years");
    }
}
