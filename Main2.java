import java.util.Scanner;

public class Main2

public static void main(String[] args) {

    Scanner scanner new Scanner(System.in);

    System.out.print("Введіть рядок: ");

    String text scanner.nextLine();

    String reversed -

    for (int i= text.length()1;

         1>= 0; i--) {

        reversed + text.charAt(1);

    }

    System.out.println("Перевернутий рядок: + reversed);

            scanner.close();}}