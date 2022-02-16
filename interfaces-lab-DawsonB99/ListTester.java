import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Vector;
/**
 * Write a description of class ListTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListTester
{
    public static int noMoreNegativity(List<Integer> negativeList)
    {
        int count = 0;
        for(int i = 0;i < negativeList.size();i++)
        {
            if(negativeList.get(i) < 0)
            {
                negativeList.set(i , negativeList.get(i) - (2 * negativeList.get(i)));
                count++;
            }
        }
        return count;
    }
    
    public static void main(String args[])
    {
        LinkedList<Integer> firstList = new LinkedList<Integer>();
        firstList.add(-8);
        firstList.add(20);
        firstList.add(-78);
        firstList.add(-24);
        firstList.add(12);
        System.out.println("Our Linked List had " + noMoreNegativity(firstList) + " negative Integers.");
        System.out.println(firstList.toString());
        
        LinkedList<Integer> firstList2 = new LinkedList<Integer>();
        firstList2.add(-9);
        firstList2.add(40);
        firstList2.add(-8);
        firstList2.add(-49);
        firstList2.add(-12);
        System.out.println("Our Linked List had " + noMoreNegativity(firstList2) + " negative Integers.");
        System.out.println(firstList2.toString());
        
        ArrayList<Integer> secondList = new ArrayList<Integer>();
        secondList.add(-56);
        secondList.add(5);
        secondList.add(8);
        secondList.add(-78);
        secondList.add(12);
        System.out.println("Our Array List had " + noMoreNegativity(secondList) + " negative Integers.");
        System.out.println(secondList.toString());
        
        ArrayList<Integer> secondList2 = new ArrayList<Integer>();
        secondList2.add(-65);
        secondList2.add(18);
        secondList2.add(81);
        secondList2.add(-25);
        secondList2.add(-34);
        System.out.println("Our Array List had " + noMoreNegativity(secondList2) + " negative Integers.");
        System.out.println(secondList2.toString());
        
        Vector<Integer> thirdList = new Vector<Integer>();
        thirdList.add(-46);
        thirdList.add(-65);
        thirdList.add(-18);
        thirdList.add(-28);
        thirdList.add(-12);
        System.out.println("Our Vector List had " + noMoreNegativity(thirdList) + " negative Integers.");
        System.out.println(thirdList.toString());
        
        Vector<Integer> thirdList2 = new Vector<Integer>();
        thirdList2.add(-45);
        thirdList2.add(-25);
        thirdList2.add(-83);
        thirdList2.add(-13);
        thirdList2.add(-4);
        System.out.println("Our Vector List had " + noMoreNegativity(thirdList2) + " negative Integers.");
        System.out.println(thirdList2.toString());
    }
}
