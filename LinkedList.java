public class LinkedList {
    private class Node {
        Node next;
        int num;

        Node(Node next, int num) {
            this.num = num;
            this.next = next;
        }
    }

    Node head;

        public void insert(LinkedList list, int data) {
        Node new_node = new Node(null, data);

        if(head == null) {
            head = new_node;
            System.out.println("Added this node " + new_node.num);
            return;
        }
        else {
         Node tracker = head;
         while(tracker.next != null) {
             tracker = tracker.next;
         }
         tracker.next = new_node;
         System.out.println("Added this node " + new_node.num);
         return;
        }
    }

    public void printList(LinkedList list) {
            Node tracker = list.head;
            while(tracker!=null) {
                System.out.print("Node " + tracker.num + " ");
                tracker = tracker.next;
            }
    }

    public void delete(LinkedList list) {
            Node left = head;
            Node right = head.next;
            while(right != null) {
                if(right.next == null) {
                    left.next = null;
                    int removed = right.num;
                    right = right.next;
                    System.out.println("removed " + removed);
                }
                else {
                    left = left.next;
                    right = right.next;
                }
            }
    }
}
