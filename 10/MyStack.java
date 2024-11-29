import java.util.ArrayList;

// реализация стека с помощью динамического массива
public class MyStack<E> {
    private ArrayList<E> list = new ArrayList<E>();

    public boolean isEmpty() { // проверка на пустоту
        if (list.size() == 0) {
            return true;
        }
        return false;
    }

    public int getSize() { // возвращает размер стека
        return list.size();
    }

    public E peek() { // возвращает элемент на вершине стека без удаления
        return list.get(getSize() - 1);
    }
    
    public E pop() { // возвращает элемент на вершине стека с удалением
        int index = getSize() - 1;
        list.remove(index);
        return list.get(index);
    }

    public void push(E o) {
        list.add(o);
    }
}
