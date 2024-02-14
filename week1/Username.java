import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Hello " + username + "!");
        scanner.close();
    }
}
