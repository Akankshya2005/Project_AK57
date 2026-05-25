package numbers;
// print the Fibonacci series up to N terms
import java.util.Scanner;
public class Program_18 {
  public static int fibo(int num)
  {
     if(num==0) return 0;
    if(num==1) return 1;
    else
     return fibo(num-1) + fibo(num-2);
  }  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 System.out.println("Enter Nth term:");
 int num = sc.nextInt();
 for(int i =0;i<num;i++)
 {
     System.out.println(fibo(i)+" ");
 }

 sc.close();
  }
}
