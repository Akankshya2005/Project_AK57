package numbers;
// check whether a number is a Spy number
public class Program_12 {
    public static void checkSpy(int num)
    {
        int sum = 0;
        int product = 1;
        int temp = num;
        
      
        while (temp > 0) {
            int digit = temp % 10; 
            sum += digit;          
            product *= digit;      
            temp /= 10;            
        }
        
        
        if (sum == product) {
            System.out.println(num + " is a Spy Number.");
        } else {
            System.out.println(num + " is not a Spy Number.");
        }
    }
    public static void main(String args[])
    {
        int num=1124;
        checkSpy(num);
    }
}
