package numbers;
//check whether a number is palindrome or not.
public class Program_8 {
    public static void checkPalindrome(int num){
        int temp =num;
        int rev=0,rem;
        while(num >0)
        {
            rem= num%10;
            rev= rev*10+rem;
            num/=10;
        }
        if(rev == temp)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String args[])
    {
        int n=878;
        checkPalindrome(n);
    }
}
