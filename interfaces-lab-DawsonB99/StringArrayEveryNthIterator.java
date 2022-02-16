import java.util.List;
import java.util.Iterator;
/**
 * Write a description of class StringArrayEveryNthIterator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringArrayEveryNthIterator implements Iterator<String>
{
    private String[] array;
    private int current;
    private int nth;

    /**
     * Constructor for objects of class StringArrayEveryNthIterator
     */
    public StringArrayEveryNthIterator(String items[] , int n)
    {
        array = items;
        current = 0;
        nth = n;
    }

    /**
    Check if the iterator has more Strings to return.

    @return whether the iterator has more Strings to return
     */
    public boolean hasNext() {

        return current < array.length;
    }

    /**
    Return the next even-indexed String from the array not yet returned.

    @return the next even-indexed String from the array not yet returned
     */
    public String next() {
        String value = array[current];
        current += nth;
        return value;
    }
    
    public static void main(String args[])
    {
        String a[] = {"This", "is", "very", "fun", "to", "do", "!" };
        String b[] = {"Chicken", "wings", "can", "be", "very", "delicious", "I", "don't", "know", "about", "you", "but", "I", "could", "go",
            "for", "some", "chicken", "wings", "right", "now" };
            
            Iterator<String> iter = new StringArrayEveryNthIterator(a, 2);
            while(iter.hasNext())
            {
                System.out.println(iter.next());
            }
            
            Iterator<String> iter2 = new  StringArrayEveryNthIterator(b, 3);
            while(iter2.hasNext())
            {
                System.out.println(iter2.next());
            }
    }
}
