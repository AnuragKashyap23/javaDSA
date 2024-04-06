import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for the first array
        System.out.println("Enter the size of the first array:");
        int sizeA = scanner.nextInt();
        int[] a = new int[sizeA];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < sizeA; i++) {
            a[i] = scanner.nextInt();
        }
        
        // Input for the second array
        System.out.println("Enter the size of the second array:");
        int sizeB = scanner.nextInt();
        int[] b = new int[sizeB];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < sizeB; i++) {
            b[i] = scanner.nextInt();
        }
        
        // Merging the arrays
        int[] mergedArray = mergeArrays(a, b);
        
        // Output the merged array
        System.out.println("Merged array:");
        for (int value : mergedArray) {
            System.out.print(value + " ");
        }
        
        scanner.close();
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        
        // Copy remaining elements
        while (i < a.length) {
            result[k++] = a[i++];
        }
        while (j < b.length) {
            result[k++] = b[j++];
        }
        
        return result;
    }
}

import java.io.*;
class Result{
    /*
     * Complete the 'mergeArrays' function below.
     * 
     * The function is expected to return an INTEGER_ARRAY.
     * the function accepts following parameters:
     * 1.INTEGER ARRAY a
     * 2. INTEGER ARRAY b
     */

     public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b){

     }
}



