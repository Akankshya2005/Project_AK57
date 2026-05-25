package numbers;
// find the sum of digits of a number
public class Program_6 {
    public static int digitSum(int num){
        int sum=0,rem;
        while(num >0)
        {
            rem= num%10;
            sum= sum+rem;
            num/=10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        int n=78;
        System.out.println("sum of digits of "+n+"="+digitSum(n));
    }
}
