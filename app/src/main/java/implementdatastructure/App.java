package implementdatastructure;

public class App {

    public static void main(String[] args) {
        /////////////////////////////////--Calling LinkedList--////////////////////////////////////////
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);

        System.out.print("Elements of the list: ");
        list.display();
        System.out.println("Size of the list: " + list.size());
        System.out.println("-----------------------------------------------------------------------------------------");
        ////////////////////////////////////--Calling Stack--//////////////////////////////////////////
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.print("Elements of the stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        System.out.println("Size of the stack: " + stack.size());
    }
}
