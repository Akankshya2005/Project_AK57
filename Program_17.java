package numbers;

import java.util.Scanner;

// print all Prime numbers from 1 to N
public class Program_17 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers from 1 to " + n + " are:");
        
       
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
