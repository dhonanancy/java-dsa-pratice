import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
  
        String num1 = scan.nextLine();
        String num2 = scan.nextLine();

        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);

        System.out.println(sum);
        System.out.println(product);
        
        scan.close();
    }
}
