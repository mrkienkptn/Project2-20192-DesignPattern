package collection;

import java.util.ArrayList;
import java.util.List;

import iterator.ArrayIter;
import iterator.Iterator;

public class Array implements Collection {
    private List<Integer> array;
    public Array(){
        array = new ArrayList<>();
    }
    public void addElement(int e){
        array.add(e);
    }
    public List<Integer> getArray(){
        return array;
    }
    @Override
    public Iterator createIterator() {        
        return new ArrayIter(this);
    }
    
}