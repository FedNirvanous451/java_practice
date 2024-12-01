import java.util.ArrayList;

// реализация стека с помощью динамического массива
public class MyStack<Object> {
    private ArrayList<Object> list = new ArrayList<>();

    public MyStack() {} ;
    public boolean isEmpty() { // проверка на пустоту
        if (list.size() == 0) {
            return true;
        }
        return false;
    }

    public int getSize() { // возвращает размер стека
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пустой");
        } // возвращает элемент на вершине стека без удаления
        return list.get(getSize() - 1);
    }
    
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пустой");
        } // возвращает элемент на вершине стека с удалением
        Object index = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return index;
    }

    public void push(Object o) {
        list.add(o);
    }
}
