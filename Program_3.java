package numbers;
//find largest among three numbers
public class Program_3 {
    public static void findLargest(int n1,int n2, int n3){

        if(n1==n2 && n2==n3)
        {
            System.out.println("ALL numbers are same");
        }
        else if(n1>= n2 &&n1>=n3)
        {
            System.out.println(n1 +" is largest");
        }
        else if(n2>=n1 && n2>= n3){
            System.out.println(n2+" is largest");
        }
        else
        {
            System.out.println(n3 + " is largest");
        }
    }
    public static void main(String args[])
    {
        findLargest(5, 0, 0);
    }
}
