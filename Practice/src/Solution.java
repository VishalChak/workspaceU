import java.io.*;
import java.util.*;

public class Solution {

    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = scan.nextInt();
        String str = "";
        for(int i=0;i<n;i++){
            str = scan.next();
            System.out.println(str);
        }
    }
}
