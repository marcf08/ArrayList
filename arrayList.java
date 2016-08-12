class ArrayList 
{                                                                                      

    String [] array; 
    int size;
    int capacity = 100000;


    public ArrayList() {
        this.size = 0;
    }   

    public void addToEnd(String val) {
        this.array[++size] = val; 
        capacity--;
    }   

    //Add to front must shift values to the right
    public void addToFront(String val) {
        int oldSize = this.size;
        for (int i = 0; i < oldSize - 1; i++) {
            array[i] = array [i + 1]; 
        }

        array[0] = val;
        this.size++;
        capacity--;
    }   
}
