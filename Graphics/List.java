package Graphics;

import java.util.ArrayList;

public class List<T> {

    private ListN<T> front = null;


    public void makeEmpty() {
        front = null;
    }




    public void addFront( T element ) {
        front = new ListN<T>( element, front );
    }


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
