
//4. Write a Java Program to convert Integer numbers and Binary numbers.
//Input: 9 
//Output: 1001


import java.util.Scanner;

class BinaryNumber
{
    public static void main(String  args[])
    {
        Scanner scanner =new Scanner(System.in);
        int number=scanner.nextInt();
        String brinary= Integer.toBinaryString(number);
        System.out.println("brinary"+brinary);
        scanner.close();   
    }
}
