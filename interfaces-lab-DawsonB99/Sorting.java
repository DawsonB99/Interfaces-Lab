import java.util.Arrays;
import java.util.ArrayList;
/**
 * Write a description of class Sorting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sorting
{
    public static void main(String args[])
    {
        String one[] = {"computer","science","is","so","much","fun!"};
        String two[] = {"You're","crazy","computer","science","sucks!"};
        
        
        Integer intOne[] = {5,10,4,5,8,6,45,65,100};
        Integer intTwo[] = {-42,78,98,4,65,-75,12,65,100};
        
        System.out.print("String Array one: ");
        for(int i = 0;i < one.length;i++)
        {
            System.out.print(one[i] + " ");
        }
        System.out.println();
        System.out.print("Integer Array one: ");
        for(int i = 0;i < intOne.length;i++)
        {
            System.out.print(intOne[i] + " ");
        }
        System.out.println();
        System.out.print("String Array two: ");
        for(int i = 0;i < two.length;i++)
        {
            System.out.print(two[i] + " ");
        }
        System.out.println();
        System.out.print("Integer Array two: ");
        for(int i = 0;i < intTwo.length;i++)
        {
            System.out.print(intTwo[i] + " ");
        }
        System.out.println();
        
        Arrays.sort(one);
        Arrays.sort(intOne);
        StringLengthComparator c = new StringLengthComparator();
        IntegerAbsComparator c2 = new IntegerAbsComparator();
        Arrays.sort(two,c);
        Arrays.sort(intTwo,c2);
        
        System.out.print("String Array one: ");
        for(int i = 0;i < one.length;i++)
        {
            System.out.print(one[i] + " ");
        }
        System.out.println();
        System.out.print("Integer Array one: ");
        for(int i = 0;i < intOne.length;i++)
        {
            System.out.print(intOne[i] + " ");
        }
        System.out.println();
        System.out.print("String Array two: ");
        for(int i = 0;i < two.length;i++)
        {
            System.out.print(two[i] + " ");
        }
        System.out.println();
        System.out.print("Integer Array two: ");
        for(int i = 0;i < intTwo.length;i++)
        {
            System.out.print(intTwo[i] + " ");
        }
        System.out.println();
    }
}
