package arrays;

import java.util.Scanner;

public class IndexSum {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

     
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
     
int even=0, odd=0;
for(int i=0;i<arr.length;i++){
    if(i%2==0) even+=arr[i];
    else odd+=arr[i];
}
System.out.println("Even Index Sum="+even);
System.out.println("Odd Index Sum="+odd);
sc.close();
}
     }
     
