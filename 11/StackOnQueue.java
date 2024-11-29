import java.util.LinkedList;
import java.util.Queue;

class StackOnQueue<E> {
    private Queue<E> q1 = new LinkedList<E>();
    private Queue<E> q2 = new LinkedList<E>();

    public StackOnQueue() {};

    public void push(E x) {
        q1.add(x);
    }

    public E pop() { // возвращает элемент на вершине стека с удалением
        if (empty()) {
            throw new IllegalStateException("Стек пустой");
        }
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        E result = q1.remove(); 
        Queue <E> temp = q1;
        q1 = q2;
        q2 = temp;
        return result;
    }

    public E top() {
        if (empty()) {
            throw new IllegalStateException("Стек пустой");
        }
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        E result = q1.peek();
        q2.add(q1.remove());
        Queue<E> temp = q1;
        q1 = q2;
        q2 = temp;
        return result;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}