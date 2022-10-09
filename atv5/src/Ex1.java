import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Queue<Character> uppercase = new LinkedList<>();
        Queue<Character> lowercase = new LinkedList<>();
        String line = scanner.nextLine();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isUpperCase(c)) {
                uppercase.add(c);
            } else if (Character.isLowerCase(c)) {
                lowercase.add(c);

            }
        }
        System.out.println("Maiúsculas:");
        while (!uppercase.isEmpty()) {
            System.out.print(uppercase.poll());
        }
        System.out.println("Minúsculas:");
        while (!lowercase.isEmpty()) {
            System.out.print(lowercase.poll());
        }
        scanner.close();
    }
}
