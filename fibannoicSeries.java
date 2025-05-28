//A Program to Find Sum of Fibonacci Series Number
//Input: n = 4
//Output: 33
//Explaination: Sum of numbers at even indexes = 0 + 1 + 3 + 8 + 21 = 33.
class fibannoicSeries
{
 
 public static void main (String args[])
 {
     int n=4;
     int a=0,b=1,sum=0;
      for( int i=0 ; i<= 2*n ;i++)
      {
         // if odd i%2 ==1
          if( i%2==0)
          {
              sum +=a;
          }
        // you want all fibannic series if ignore  use only int next and print next after swap
           int next=a+b;
           a=b;
           b=next;
      }
      System.out.println("Sum of the fibannoic Series"+ sum);
 }   
}
