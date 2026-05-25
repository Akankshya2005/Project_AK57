package numbers;
// check whether a number is an Armstrong number
public class Program_10 {
    public static void checkArmstrong(int num)
    {   int sum=0;
         int temp = num; // Reset temp to the original number
        int digits= no_digits(temp);
        
        while (temp > 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
         if (sum == num) {
            System.out.println( " Armstrong number.");
        } else {
            System.out.println( " NOT an Armstrong number.");
        }
        
    }
     public static int no_digits(int num)
    {
        int count=0;
        
        while(num>0)
        {
            if(num==0)
            {
                count=1;
                return count;
            }
             num= num/10;
            count++;
           
        }
        return count;
 
    }
       
        
   public static void main(String[] args) {
    int num=123;
    checkArmstrong(num);
   }
}

