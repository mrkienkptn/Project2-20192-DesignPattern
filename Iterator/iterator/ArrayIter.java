package iterator;
import collection.Array;

public class ArrayIter implements Iterator{
    private Array array;    
    private int index;

    public ArrayIter(Array array){
        this.array = array;
        index = 0;
    }
    
    @Override
    public boolean hasNext() {
        return index < array.getArray().size();
    }

    @Override
    public int getNext() {
        System.out.print("Get element "+index+": ");
        return array.getArray().get(index++);
    }    
}