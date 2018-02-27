package Graphics;

import java.util.ArrayList;

public class List<T> {
    private int numberOfNodes = 0;
    private ListN<T> front = null;

    public boolean isEmpty() {
        return (front == null);
    }


    public void makeEmpty() {
        front = null;
        numberOfNodes = 0;
    }


    public int size() {
        return numberOfNodes;
    }


    public void addFront( T element ) {
        front = new ListN<T>( element, front );
        numberOfNodes++;
    }


    public T peek() {
        if (isEmpty())
            return null;

        return front.getData();
    }


    public T removeFront() {
        T tempData;

        if (isEmpty())
            return null;

        tempData = front.getData();
        front = front.getNext();
        numberOfNodes--;
        return tempData;
    }

    public void removeEnd(T element) {
        ListN<T> node=front;
        while(node.getNext() != null)
        {
            node = node.getNext();
        }
        node.setNext(new ListN<T>((T)element, null));
    }

    @SuppressWarnings("unchecked")
    public ArrayList<T> getArray() {

        ArrayList<T> shapeArray=new ArrayList<T>();

        ListN<T> node=front;
        while (node!=null)
        {
            shapeArray.add(node.getData());
            node = node.getNext();
        }

        return shapeArray;
    }
}
