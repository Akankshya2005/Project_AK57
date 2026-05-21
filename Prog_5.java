public class Prog_5 {
   
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a+" "+"b = " + b);
     

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter Swapping:");
 System.out.println("a = " + a+" "+"b = " + b);
    }
}

