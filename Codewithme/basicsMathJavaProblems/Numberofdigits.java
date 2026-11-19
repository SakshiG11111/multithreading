package basicsMathJavaProblems;

import java.util.Scanner;

public class Numberofdigits {

    public static int countDigits(long n) {
          int count=0;
           while(n>=0)
           {
              n/=10;
              count++;
           }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            long number = sc.nextLong();

            int result = countDigits(number);
            System.out.println("Number of digits: " + result);
        }
    }
}
