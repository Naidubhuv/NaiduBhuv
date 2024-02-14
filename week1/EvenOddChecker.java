import java.util.*;
public class EvenOddChecker {
    public static void main(String[] args) {
        int number;
        Scanner input= new Scanner(System.in);
        number=input.nextInt();
        input.close();
        if(isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
    public static boolean isEven(int number) {
        // A number is even if it is divisible by 2 without any remainder
        return number % 2 == 0;
    }
}
