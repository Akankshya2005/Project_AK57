package numbers;
// check whether a number is a Duck number.
public class Program_13 {
    public static void checkDuck(int num)
    {
        String numStr =String.valueOf(num) ; 
        
        
        if (numStr.charAt(0) == '0') {
            System.out.println( "  not a Duck Number.");
        } else {
            boolean hasZero = false;
           
            for (int i = 1; i < numStr.length(); i++) {
                if (numStr.charAt(i) == '0') {
                    hasZero = true;
                    break; 
            }
            
           
            if (hasZero) {
                System.out.println( " Duck Number.");
            } else {
                System.out.println( " not a Duck Number.");
            }
        }
    }
}
    public static void main(String[] args) {
        int num=608;
        checkDuck(num);
    }

}
