package numbers;
// check whether a number is a Neon number
public class Program_11 {
    public static void checkNeon(int num)
    {
        int square = num * num;
        int sum = 0;
        
       
        int temp = square;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;                
            temp /= 10;            
        }
        
      
        if (sum == num) {
            System.out.println(num + " is a Neon Number.");
        } else {
            System.out.println(num + " is not a Neon Number.");
        }
    }
    public static void main(String[] args) {
        int num=9;
        checkNeon(num);
    }
}
