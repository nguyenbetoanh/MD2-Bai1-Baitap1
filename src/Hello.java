import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        System.out.println("xin mời nhập tên của ngài !");
        Scanner name =new Scanner(System.in);
        String hello= name.nextLine();

        System.out.println("Xin chào ngài : " + hello);
    }
}