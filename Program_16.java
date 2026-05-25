package numbers;
// to check whether a number is a Prime number
public class Program_16 {
    public static void checkPrime(int num)
    { 
 int rem=-1;
    if(num == 1)
    {  System.out.println("neither prime nor composite");}
    else{
      for(int i=2;i<num;i++)
         {rem = num % i; 
           if(rem == 0)
              { break;}
         }
    }
 if(rem == 0)
    {
        System.out.println("Not prime");
    }
    else 
    {
        System.out.println("Prime");
    }
}
public static void main(String[] args) {
    int num=2;
    checkPrime(num);
}
    
}
