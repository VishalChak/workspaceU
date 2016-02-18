import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class copy {
 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        final int[] ratings = new int[n];
        Integer[] positions = new Integer[n];        
        int[] candies = new int[n];
        int count = 0;
       
        for (int i = 0; i < n; i++) {
            ratings[i] = scanner.nextInt();
            positions[i] = i;
        }
       
        Arrays.sort (positions, new Comparator<Integer>(){
            public int compare(Integer a, Integer b) {
                if (ratings[a] < ratings[b]) return -1;
                return 1;
            }
        });
       
        for (int i : positions) {
            int c = 1;
            if (i > 0 && ratings[i] > ratings[i-1]) {
                c = Math.max(c, candies[i-1]+1);
            }
            if (i < ratings.length - 1 && ratings[i] > ratings[i+1]) {
                c = Math.max(c, candies[i+1]+1);
            }
            candies[i] = c;
            count += c;
        }
       
        System.out.println(count);
    }
}