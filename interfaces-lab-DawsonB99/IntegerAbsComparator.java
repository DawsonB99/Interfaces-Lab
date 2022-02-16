import java.util.Comparator;
/**
 * Write a description of class IntegerAbsComparator here.
 *
 * @author Dawson Bridger
 * @version SPring 2020
 */
public class IntegerAbsComparator implements Comparator<Integer>
{
    public int compare(Integer a, Integer b)
    {
        return Math.abs(a) - Math.abs(b);
    }
    
    public static void main(String args[]) {

	IntegerAbsComparator c = new IntegerAbsComparator();
	System.out.println("compare(5,10): " + c.compare(5, 10));
	System.out.println("compare(-5, 10): " + c.compare(-5, 10));
	System.out.println("compare(0, 9): " + c.compare(0, 9));
	System.out.println("compare(-78, 100): " + c.compare(-78, 100));
	System.out.println("compare(0,0): " + c.compare(0, 0));
    }
}
