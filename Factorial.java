//5.Write a Program to Find Factorial of a Number in Java.
//Input: 5
//Output: 120

import java.util.stream.IntStream;

class Factorial
{
    public static void main (String args [])
    {
        
        Integer number=5;
       Integer factorialNo= IntStream.rangeClosed(1,number).reduce(1,(a,b)->a*b);
       System.out.println("factorialNo"+factorialNo);
        
    }
    
}
