//2. Adding Two number 
//-------------------
//Step 1
//------

import java.util.stream.Stream;

class PractiseProblem 
{
    
    public static void main (String args[])
    {
        Integer addingTwoNumber=Stream.of(2,3).reduce(0,(a,b)-> a+b);
        System.out.println("addingTwoNumber"+addingTwoNumber);
        
    }
    
    
}

//Step 2
//------

import java.util.stream.Stream;

class PractiseProblem 
{
    
    public static void main (String args[])
    {
        int addingTwoNumber=Stream.of(2,3).mapToInt(Integer:: intValue).sum();
        System.out.println("addingTwoNumber"+addingTwoNumber);
        
    }
    
    
}
