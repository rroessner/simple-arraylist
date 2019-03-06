/******************************
*  Week 1 lab - exercise 3:   *
*   a simple ArrayList class  *
*******************************/

/**
 * Class to test the ArrayList class.
 */
public class Main
{

    public static void main(String[] args)
    {
        ArrayList myList = new ArrayList();
        System.out.println("Initial size of myList array: " + myList.getSize());


        myList.add(24);    // generate random number between 0 and 500
        myList.add(17);
        myList.add(23);
        myList.add(12);
        myList.add(9);
        myList.add(7);
        myList.add(19);
        myList.add(15);
        myList.add(21);
        myList.add(3);

        myList.display();


        System.out.println("Final size of myList array: " + myList.getSize());



    }
}
