//3.Swap Two Numbers
//-------------------


import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class SwapTwoNumber
{
    
    public static void main (String args[])
    {
        Integer a=2,b=5;
       List<Integer> swapNumber=Stream.of(a,b).collect(Collectors.toList());
       a=swapNumber.get(1);
       b=swapNumber.get(0);
     System.out.println("a ==>"+a+" b===>"+b);    
        
    }
    
}
