package exampleTask1;
import java.util.Scanner;

public class ExampleTask1App {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
    int n = sc.nextInt();
    if (n > 0) System.out.println("positive");
    else System.out.println("negative");
    }
}
