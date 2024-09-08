import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter <= 5) {

            System.out.print("Enter number #" + counter + ": ");
            String nextNumber = scanner.nextLine();

            try {
                int number = Integer.parseInt(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException e) {
                System.err.println("Invalid number");
            }

        }

        System.out.println("Sum: " + sum);
    }
    
}
