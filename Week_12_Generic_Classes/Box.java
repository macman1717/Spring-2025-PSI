package Week_12_Generic_Classes;

public class Box<T> {
    public Box() {
    }
    private T item;
    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }

}
