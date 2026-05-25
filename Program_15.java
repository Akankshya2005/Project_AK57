package numbers;
// to check whether a number is a Perfect number
public class Program_15 {
    public static void checkPerfect(int num)
    {
        int sum = 0;

       
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        if (sum == num && num > 0) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is not a Perfect Number.");
        }
    }
    public static void main(String[] args) {
        int num =6;
        checkPerfect(num);
    }
}
