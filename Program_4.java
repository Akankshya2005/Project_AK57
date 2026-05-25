package numbers;
// swap two numbers using a third variable
public class Program_4 {

    public static void main(String[] args) {

        int a = 18;
        int b = 30;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a +" " +"b = " + b);

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter Swapping:");
         System.out.println("a = " + a +" " +"b = " + b);
    }
}
