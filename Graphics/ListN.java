package Graphics;

public class ListN<T> {
    private T data;
    private ListN next;

    public ListN( T nodeData ) {
        this( nodeData, null);
    }

    public ListN( T nodeData, ListN nodeNext ) {
        data = nodeData;
        next = nodeNext;
    }

    public T getData() {
        return data;
    }

    public ListN getNext() {
        return next;
    }

    public void setData( T newData ) {
        data = newData;
    }

    public void setNext( ListN newNext ) {
        next = newNext;
    }
}
