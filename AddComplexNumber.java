//Write a Java Program to Add two Complex Numbers.

//Input:   1+2i
//         4+5i
//Output:  5+7i
import java.util.stream.Stream;
class AddComplexNumber
{
    public static void main(String args[])
    {
        String[] inputs={"1+2i","4+5i"};
        int [] result= Stream.of(inputs).map(s->s.replace("i","").split("\\+"))
         .map(arry -> new int[]{Integer.parseInt(arry[0]),Integer.parseInt(arry[1])}).reduce(new int[2],(a,b)-> new int[]{a[0]+b[0], a[1]+b[1]} );
         System.out.println(result[0]+"+"+result[1]+"i");
    }    
}
