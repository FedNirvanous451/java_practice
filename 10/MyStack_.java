import java.util.ArrayList;

public class MyStack_ implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int getSize() {
        return list.size();
    }
    public Object peek() {
        return list.get(getSize() - 1);
    }
    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
    public void push(Object o) {
        list.add(o);
    }
    protected MyStack_ clone() throws CloneNotSupportedException {
        MyStack_ cloned = (MyStack_) super.clone();
        cloned.list = new ArrayList<>(list);
        return cloned;
    }
}

