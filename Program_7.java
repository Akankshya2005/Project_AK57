package numbers;
//find  reverse a number
public class Program_7 {
    public static int reverse(int num){
        int rev=0,rem;
        while(num >0)
        {
            rem= num%10;
            rev= rev*10+rem;
            num/=10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        int n=78;
        System.out.println("reverse of "+n+"="+reverse(n));
    }
}
