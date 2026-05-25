package numbers;
// find the factorial of a number
public class Program_19 {
     public static int fact(int n)
{
    if(n==0)
     return 1;
     else
     return n* fact(n-1);

}
public static void main(String[] args){
    int num=5;
    System.out.println("Factotial of "+ num+"="+ fact(num));
}

}
