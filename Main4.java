import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) { Scanner scanner new Scanner(System.in);

        System.out.print("Введіть рядок: "); String text scanner.nextLine();

        text text.replace(target: "", replacement"); text text.replace(target:"", replacement: ");

        String[] words text.split(regex:"");

        String result = words[0].toLowerCase();

        for (int i = 1; 1 words.length; i++) { String word words[i].toLowerCase(); result += word.substring(0, 1).toUpperCase() + word.substring(beginindex 1);

        }

        System.out.println("camelCase: + result);

                scanner.close();}}