public class Stack {

    private class Node {
        Stack.Node next;
        int num;

        Node(Stack.Node next, int num) {
            this.num = num;
            this.next = next;
        }
    }

    Node head;
    Node top;

    public void push (Stack stack, int data) {
        Node new_node = new Node(null, data);
        if(stack.head == null) {
            head = new_node;
            top = head;
            System.out.println("Put " + new_node.num);
            return;
        }
        else {
            Node tracker = head;
            while(tracker != null) {
                if(tracker.next == null) {
                    tracker.next = new_node;
                    top = tracker;
                    System.out.println("Put " + new_node.num);
                    return;
                }
                else {
                    tracker = tracker.next;
                }
            }
        }
    }

//    public void pop (Stack stack) {
//
//    }

    public void peek(Stack stack) {
        System.out.println("Peeking " + stack.top.num);
    }

    public void pop(Stack stack) {
        Node left = head;
        Node right = head.next;
        while(right!=null) {
            if(right.next == null) { // This means we are at the top of the stack
                int removed = right.num;
                left.next = null;
                top = left;
                System.out.println("Popped " + removed);
                right = right.next;
            }
            else { // Keep traversing
                 right = right.next;
                 left = left.next;
            }
        }
    }
}
