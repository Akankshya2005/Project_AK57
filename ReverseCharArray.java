package arrays;


    import java.util.Scanner;

public class ReverseCharArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();

        char[] arr = new char[n];

        
        System.out.println("Enter characters:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }

      
        System.out.println("Characters in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

