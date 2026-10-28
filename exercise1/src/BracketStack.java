public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    public void push(char value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char val = top.data;
        top = top.next;
        return val;
    }

    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}