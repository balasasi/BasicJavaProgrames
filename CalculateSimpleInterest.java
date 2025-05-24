// Write a Program to Calculate Simple Interest in Java
//Input : P = 10000  R = 5  T = 5;Output=2500;
import java.util.stream.Stream;
class CalculateSimpleInterest
{
  public static void main (String args[])
  { 
    Integer P=10000,R=5,T=5;
    Integer calucateSimpleInsterest=Stream.of(P,R,T).mapToInt(Integer::intValue).reduce(1,(a,b)-> (a*b))/100;
    System.out.println("calucateSimpleInsterest==>"+calucateSimpleInsterest);      
  }
}
