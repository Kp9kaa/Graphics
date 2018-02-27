package Graphics;

public class ListN<T> {
    private T data;
    private ListN next;



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

}
