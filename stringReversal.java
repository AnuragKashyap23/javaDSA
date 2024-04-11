
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
