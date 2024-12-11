import java.util.ArrayList;

public class GenericStack<E> extends ArrayList<E> {
    public GenericStack() {
        super();
    }
    public int getSize() {
        return size();
    }
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return get(getSize() - 1);
    }
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
    }

    public void push(E o) {
        add(o);
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public String toString() {
        return "стек: " + super.toString();
    }
}
