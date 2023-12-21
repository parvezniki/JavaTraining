public class DynamicArray {
    String localArray[] = new String[10];
    int capacity;
    int size=0;
    int index=0;
    DynamicArray() {
        capacity = 10;
    }
    public void add(String val) {
        if(percentOccupied()>=80) {
            increaseTheArraySize();
        } else {
            localArray[index] = val;
            index++;
        }
    }
    private void increaseTheArraySize() {
        capacity = capacity + (capacity/2);
        String tempArray[] = new String[capacity];
        for(int i=0;i<index;i++) {
            tempArray[i] = localArray[i];
        }
        localArray = tempArray;
    }
    public void remove(int index) {

    }
    public String get(int index) {
        return(localArray[index]);
    }
    public void set(int index,String value) {
        localArray[index] = value;
    }
    public int capacity() {
        return this.capacity;
    }
    public int size() {
        size = index;
        return size;
    }
    public double percentOccupied() {
        return ((double)size() / (double)capacity)*100.0;
    }
    @Override
    public String toString() {
        String allValues="[";
        for(int i=0;i<index;i++) {
            String val = localArray[i];
            allValues += val+",";
        }
        allValues  = allValues.substring(0,allValues.length()-1)+"]";

        return allValues;
    }
}
