import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            String n = scan.next();
            
            // Initialize BigInteger with the input string
            BigInteger number = new BigInteger(n);
            
            // Check primality with a high certainty score (100)
            if (number.isProbablePrime(100)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
        scan.close();
    }
}
