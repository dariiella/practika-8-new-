import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner scanner new Scanner(System.in);

        System.out.print("Введіть рядок: ");

        String text scanner.nextLine();

        text text.toLowerCase();

        String reversed = "";

        for (int i= text.length()1; 10; 1--) { }

        reversed = text.charAt(1);

        if (text.equals(reversed)) {

            System.out.println("Рядок є паліндромом");

        } else { System.out.println("Рядок НЕ в паліндромом"); }

        scanner.close();}}