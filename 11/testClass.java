
public class testClass {
    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();
        stack.push(3);
        stack.push("papa");
        System.out.println(stack.top());
        System.out.println(stack.pop());
        stack.pop();
        System.out.println(stack.empty());
    }
}
