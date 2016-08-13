class ArrayList 
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

    public ArrayList() {
        this.size = 0;
    }   

    /*
        Method adds the value to the end of the array list. 
        @param val the value to add to the end of the list
    */
    public void addToEnd(String val) {
        this.array[++size] = val; 
        capacity--;
    }   


    /*
        Method adds an element to the front of the string.
        @param val the value to add to the front
    */
    public void addToFront(String val) {
        int oldSize = this.size;
        for (int i = 0; i < oldSize - 1; i++) {
            array[i] = array [i + 1]; 
        }
        array[0] = val;
        this.size++;
        capacity--;
    }   

    /*
       Method returns the size of the array list.
       @return size the size of the array list
    */
    public int getSize() {
        return this.size;
    }

    


}
