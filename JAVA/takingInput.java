import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking a string input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Taking an integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Displaying the input
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        
        scanner.close();
    }
}
