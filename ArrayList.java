/******************************
*  Week 1 lab - exercise 3:   *
*   a simple ArrayList class  *
*******************************/

import java.util.Arrays;

/**
 * Class implementing an array based list.
 */
public class ArrayList
{
    /**
     * Default constructor. Sets length to 0, initializing the list as an empty
     * list. Default size of array is 20.
     */
    public ArrayList()
    {
        list = new int[SIZE];
        length = 0;
    }

    /**
     * Determines whether the list is empty
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty()
    {
        return length == 0;
    }

    /**
     * Prints the list elements.
     */
    public void display()
    {
        for (int i = 0; i < length; i++)
        {
            System.out.print(list[i] + " ");
        }

        System.out.println();
    }

    /**
     * Adds the element x to the end of the list. List length is increased by 1.
     * If the array is full, the size of the array is increased by 100 and element x is added to the end of the list.
     *
     * @param x element to be added to the list
     */
    public void add(int x)
    {
        int arrayLength = list.length;  // get size of array
        if (length == arrayLength)
        {
            list = Arrays.copyOf(list, 100 + list.length);
            list[length] = x;
            length++;

        } else
        {
            list[length] = x;
            length++;
        }
    }

    /**
     * Removes the element at the given location from the list. List length is
     * decreased by 1.
     *
     * @param pos location of the item to be removed
     */
    public void removeAt(int pos)
    {
        for (int i = pos; i < length - 1; i++)
        {
            list[i] = list[i + 1];
        }
        length--;
    }

    /**
     * Prints the number of elements in the list.
     */
    public int getLength()
    {
        return length;
    }

    public int getSize()
    {
        return list.length;
    }
    
    private static final int SIZE = 10;	//size of the array that stores the list items
    private int[] list;                 //array to store the list items
    private int length;			//amount of items in the list
}
