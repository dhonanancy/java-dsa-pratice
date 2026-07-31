import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextInt()) return;
        
        int n = scan.nextInt();
        int m = scan.nextInt();
       
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        BitSet[] bitsets = new BitSet[]{b1, b2};
        
        for (int i = 0; i < m; i++) {
            String opcode = scan.next();
            int op1 = scan.nextInt();
            int op2 = scan.nextInt();
            
            switch (opcode) {
                case "AND":
                    bitsets[op1 - 1].and(bitsets[op2 - 1]);
                    break;
                case "OR":
                    bitsets[op1 - 1].or(bitsets[op2 - 1]);
                    break;
                case "XOR":
                    bitsets[op1 - 1].xor(bitsets[op2 - 1]);
                    break;
                case "FLIP":
                    bitsets[op1 - 1].flip(op2);
                    break;
                case "SET":
                    bitsets[op1 - 1].set(op2);
                    break;
            }
            
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
        scan.close();
    }
}
