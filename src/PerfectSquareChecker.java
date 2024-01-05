import java.util.Scanner;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean sent = true;
        do{
            System.out.println("Enter a Number (Greater than 9999 to quit): ");
            double num = scan.nextDouble();
            if(Math.sqrt(num) % 1 == 0)
                System.out.println("Your number is a perfect square!");
            else
                System.out.println("Your number is not a perfect square.");
            if(num > 9999)
                sent = false;
        } while(sent);



    }
}
