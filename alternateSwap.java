// This program takes string input from user and produce output by swapping alternate letters.
// Examples: 
// Input: abcdef
// Output: badcfe

import java.util.Scanner;
public class alternateSwap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Output: " + swapLetters(input));
        scanner.close();
    }

    public static String swapLetters(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i += 2) {
            
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }
        return new String(chars);
    }
}
