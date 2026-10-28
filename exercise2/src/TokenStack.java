public class TokenStack {

    private class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public TokenStack() {
        top = null;
    }

    public void push(String value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String val = top.data;
        top = top.next;
        return val;
    }

    public boolean isEmpty() {
        return top == null;
    }
}