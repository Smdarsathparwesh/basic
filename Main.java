public class Main {
    public static void main(String[] args) {
        // Declare and initialize variables
        int num1 = 10;
        int num2 = 20;
        String name = "John";

        // Print variables
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Name: " + name);

        // Basic arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        // Conditional statement
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }

        // Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, World!");
        }
    }
}
