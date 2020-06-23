package client;
import collection.Array;
import iterator.Iterator;

public class CLient {
    public static void main(String[] args) {
        Array collection = new Array();
        //add element to number list
        collection.addElement(4);
        collection.addElement(6);
        collection.addElement(2);
        collection.addElement(44);
        collection.addElement(55);
        collection.addElement(61);
        //create iterator to transverse list
        Iterator arrayIter = collection.createIterator();
        //transverse
        while(arrayIter.hasNext()){
            int elem = arrayIter.getNext();
            System.out.println(elem);
        }
    }
}