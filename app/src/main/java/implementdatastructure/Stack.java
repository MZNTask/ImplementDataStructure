package implementdatastructure;

public class Stack {
    private LinkedList list;

    public Stack() {
        list = new LinkedList();
    }

    public void push(int data) {
        list.addFirst(data);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int data = list.head.data;
        list.head = list.head.next;
        list.size--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.head.data;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
