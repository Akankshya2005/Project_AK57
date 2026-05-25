package numbers;


// to check whether a number is a Strong number
public class Program_14 {
    public static int getFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void checkStrong(int num)
    {
        int temp = num;
        int sum = 0;

        
        while (num > 0) {
            int digit = num % 10;   
            sum += getFactorial(digit); 
            num /= 10;              
        }

        
        if (sum == temp) {
            System.out.println(temp+ " is a Strong Number.");
        } else {
            System.out.println(temp + " is not a Strong Number.");
        }
        
    }
    public static void main(String[] args) {
        int num=145;
        checkStrong(num);
    }

   
        
}
