/*
   This is a basic Array List class and a test function for it.
   @author Marcus Flores
 */

public class ArrayList
{
    /*
       Specifies the data member used for this array list
     */
    String [] array;

    /*
       Specifies the size of this array list
     */
    int size;

    /*
       Specifies the maximum capacity of this array list
     */
    int capacity = 100000;

    /*
       Default constructor
     */
    public ArrayList() {
        this.size = 0;
        array = new String[this.capacity];
    }

    /*
       Method adds the value to the end of the array list.
       @param val the value to add to the end of the list
     */
    public void addToEnd(String val) {
        this.array[size] = val;
        size++;
        capacity--;
    }


    /*
       Method adds an element to the front of the string.
       @param val the value to add to the front
     */
    public void addToFront(String val) {
        this.size++;
        for (int i = this.size; i >= 1; i--) {
            array[i] = array [i - 1];
        }
        array[0] = val;
        capacity--;
    }

    /*
       Method returns the size of the array list.
       @return size the size of the array list
     */
    public int getSize() {
        return this.size;
    }


    /*
       Gets the value at the index of the given parameter.
       @param index the index of the value to get
       @return the value at the given index
     */
    public String getVal(int index) {
        return this.array[index];
    }

    /*
      Prints the entire array list.
    */
    public void print() {
      for (int i = 0; i < this.size; i++) {
        System.out.println(array[i]);
      }
    }

    /*
       Designates some tests for our array list class.
       @param args an array of command line arguments (not used)
     */

    public static void main(String [] args) {
        System.out.println("**BEGIN TEST***");
        ArrayList array = new ArrayList();

        System.out.println("***ADD VALUES***\n");
        array.addToEnd("ABC");
        array.addToEnd("DEF");
        array.addToEnd("GHI");

        array.print();

        System.out.println("***ADD TO FRONT***\n");
        array.addToFront("FRONT");

        array.print();

        System.out.println("***END TEST***\n");
    }
}
