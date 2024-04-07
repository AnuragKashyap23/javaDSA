import java.util.*;

public class missingFirstPositiveNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input from the user
        System.out.println("Enter a string of integers separated by spaces:");
        String input = scanner.nextLine();

        // Step 2: Convert input string into an array of integers
        String[] stringArray = input.split(" ");
        int[] intArray = Arrays.stream(stringArray)
                               .mapToInt(Integer::parseInt)
                               .toArray();

        // Step 3: Find the first missing positive integer
        int missingNumber = findMissingPositive(intArray);
        System.out.println("The first missing positive integer is: " + missingNumber);
    }

    public static int findMissingPositive(int[] nums) {
        Set set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }

        int missing = 1;
        while (set.contains(missing)) {
            missing++;
        }

        return missing;
    }
}