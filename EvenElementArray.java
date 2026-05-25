package arrays;


    import java.util.Scanner;

public class EvenElementArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

   
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

       
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Even elements in the array:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}

