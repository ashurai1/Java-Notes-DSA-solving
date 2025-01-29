public class DataTypes {
    public static void main(String[] args) {
        // Introduction to Data Types in Java
        System.out.println("Data types in Java are divided into two categories: primitive and non-primitive.");

        // Primitive Data Types
        int intValue = 10; // Integer
        float floatValue = 10.5f; // Floating point
        char charValue = 'A'; // Character
        boolean boolValue = true; // Boolean

        System.out.println("Primitive Data Types:");
        System.out.println("int: " + intValue);
        System.out.println("float: " + floatValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + boolValue);

        // Non-Primitive Data Types
        String stringValue = "Hello, World!"; // String
        int[] arrayValue = {1, 2, 3, 4, 5}; // Array

        System.out.println("Non-Primitive Data Types:");
        System.out.println("String: " + stringValue);
        System.out.print("Array: ");
        for (int num : arrayValue) {
            System.out.print(num + " ");
        }
    }
}
