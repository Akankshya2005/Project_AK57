package numbers;
//check even or odd number
public class Program_1 {
 public void chekEvenOdd(int num){
       if(num%2 == 0)
        {
            System.out.println("Even");
        } 
        else{
            System.out.println("Odd");
        }    
        }
    public static void main(String[] args) {
       Program_1 p = new Program_1();
       p.chekEvenOdd(10);
       
    }
}
