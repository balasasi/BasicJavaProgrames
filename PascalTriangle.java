///Program to Print the Pascal's Triangle in Java


//Step -1
//1 
//1 1 
//1 2 1 
//1 3 3 1 
//1 4 6 4 1
// Program explainnation   1 1,1 1 1+1 1-> 121 ,1 2+1 2+1  1 ->1 3 3 1->  1  3+1 3+3 3+1  1-> 1 4 6 4 1  


public class PascalTriangle {
    public static void main(String[] args) 
    {
        int N = 5; 
        for (int i=0;i<N;i++)
        {
            int number =1;
            for (int j=0; j<=i;j++)
            {
             System.out.print(number +" ");// print   console in same line
             number =number * (i-j)/(j+1);
            }
            System.out.println();// print ln line by line
        }
    }
}
// step 2
//             1
//           1   1
//         1   2   1
//       1   3   3   1
//     1   4   6   4   1
//   1   5   10   10   5   1


//   same Star Pattern
//     *
//    ***
//   *****
 // *******

public class PascalTriangleStepTwo {
    public static void main(String[] args) 
    {
        int N = 5; 
        for (int i=0;i<N;i++)
        {
            for(int s=0; s<N-i-1;s++ )
            {
             System.out.print(" ");
            } 
            int number =1;
            for (int j=0; j<=i;j++)
            {
             System.out.print(number +" ");
             number =number * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}


