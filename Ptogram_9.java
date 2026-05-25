package numbers;
//count the number of digits in a number
public class Ptogram_9 {
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
        int number=9;
        System.out.println("Number of digits = "+ no_digits(number));
    }
}
