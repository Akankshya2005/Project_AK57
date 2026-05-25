package numbers;
// check whether a number is positive, negative, or zero.
public class Program_2 {
    public  static void checkNum(int num)
    {
        if(num >0)
        {
            System.out.println("positive");
        }
        else if(num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
    public static void main(String[] args) {
       checkNum(45);
    }
}
