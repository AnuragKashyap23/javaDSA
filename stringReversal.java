// In this program, user enters a string which is a combination of letters and numbers, and 
// converts this into another string in which letters and numbers are sparated and arranged.
// examples:
// Input:abc3kjg45gg82
// Output: abckjggg34582

import java.util.Scanner;
public class stringReversal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(numGame(str));
    }

    public static String numGame(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.append(c);
            } else {
                letters.append(c);
            }
        }

        return letters.append(numbers).toString();
    }
}
