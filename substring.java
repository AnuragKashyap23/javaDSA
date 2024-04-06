// Finding Substring Concatenations

// Once upon a time, in the mystical land of Java, there lived a group of word hunters. These skilled individuals were tasked with a special quest: to Find hidden patterns within strings.

// Our protagonist, named Main, was one such word hunter. Armed with his trusty Java programming skills, Main embarked on a journey to uncover substrings within strings that were formed by concatenating a specific set of words.

// One day, Main received a mysterious string from a wise sage. The sage told Main that hidden within this string were magical substrings formed by concatenating a set of special words. Excited by the challenge, Main eagerly accepted the task.

// With his Java skills at the ready, Main set out to solve the puzzle. He started by carefully examining the string, segmenting it into smaller parts to analyze. Each segment was compared against a list of target words provided by the sage

// Using his map of word counts, Main diligently tracked the occurrences of each word within the string. For every potential substring found, Main cross-checked the word counts to ensure they matched the expected concatenation.

// As Main traversed through the string, he encountered various challenges. Sometimes, the substrings seemed promising at first but turned out to be dead ends. Other times, he found himself navigating through intricate patterns of words.
// Despite the obstacles, Main persevered, determined to uncover all the magical substrings hidden within the string. With each discovery, he marked down the starting indices of these substrings, bringing him closer to completing his quest.

// After much exploration and analysis, Main Finally emerged victorious. He had successfully identified all the substrings formed by concatenating the special words. With a sense of accomplishment, Main shared his Findings with the wise sage, who praised him for his dedication and skill.

// And so, Main's journey came to an end, but his adventures in the world of word hunting continued, as he embarked on new quests to unravel more mysteries hidden within strings.

// Examples:

// Input:

// barfoothefoobarman foo, bar

// Output:

// Starting indices of substrings: [0, 9]

// Input:

// woodbestword

// word

// Output:

// Starting indices of substrings: [8]
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class substring{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the main string:");
        String s = scanner.nextLine();
        
        System.out.println("Enter the number of words:");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline
        
        String[] words = new String[count];
        System.out.println("Enter the words:");
        for (int i = 0; i < count; i++) {
            words[i] = scanner.nextLine();
        }
        
        List<Integer> indices = findSubstring(s, words);
        System.out.println("Starting indices of substrings: " + indices);
        
        scanner.close();}

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> indices = new ArrayList<>();
        if (s == null || words == null || words.length == 0) return indices;

        int wordLength = words[0].length();
        int substringLength = wordLength * words.length;
        if (s.length() < substringLength) return indices;

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= s.length() - substringLength; i++) {
            Map<String, Integer> seenWords = new HashMap<>();
            int j = 0;
            while (j < words.length) {
                String word = s.substring(i + j * wordLength, i + (j + 1) * wordLength);
                if (wordCount.containsKey(word)) {
                    seenWords.put(word, seenWords.getOrDefault(word, 0) + 1);
                    if (seenWords.get(word) > wordCount.get(word)) break;
                } else break;
                j++;
            }
            if (j == words.length) indices.add(i);
        }
        return indices;
    }
}