/*
 * This program extracts lowercase letters from two strings and display the combination of it.
 * Example:
 * String1 = "ABcdeFgH"
 * String2 = "ghDGigk"
 * Output : "cdegghigk"
 */


import java.util.Scanner;

public class LowerCaseExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String input1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String input2 = scanner.nextLine();
        
        StringBuilder lowercaseBuilder = new StringBuilder();
        
        lowercaseBuilder.append(extractLowerCase(input1));
        lowercaseBuilder.append(extractLowerCase(input2));
        
        String combinedLowercase = lowercaseBuilder.toString();
        System.out.println("Combined lowercase letters: " + combinedLowercase);
    }
    
    public static String extractLowerCase(String input) {
        StringBuilder lowercaseBuilder = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                lowercaseBuilder.append(c);
            }
        }
        
        return lowercaseBuilder.toString();
    }
}