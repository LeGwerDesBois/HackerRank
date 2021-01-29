import java.io.*;
import java.util.*;

import java.util.BitSet;

public class JavaBitSet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        BitSet b[] = new BitSet[2];
        b[0] = new BitSet(n);
        b[1] = new BitSet(n);
        for (int i = 0; i < m; i++) {
            String op = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            switch (op) {
                case "AND": b[x - 1].and(b[y - 1]);
                    break;
                case "OR":  b[x - 1].or(b[y - 1]);
                    break;
                case "XOR": b[x - 1].xor(b[y - 1]);
                    break;
                case "FLIP": b[x - 1].flip(y );
                    break;
                case "SET": b[x - 1].set(y );
                    break;
                default:  System.out.println("Valid command are : AND, OR, XOR, FLIP, SET ");
                    break;
            }
            System.out.println(b[0].cardinality() + " " + b[1].cardinality());
        }
    }
}