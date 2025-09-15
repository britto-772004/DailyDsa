class Node{
    int coefficient;
    int power;
    Node next = null;

    Node(int coefficient,int power){
        this.coefficient = coefficient;
        this.power = power;

    }

    Node insert(Node head,int coefficient,int power){
        Node newnode = new Node(coefficient,power);

        if(head == null){
            return newnode;
        }

        Node temp = head;
        while(temp != null){
            temp = temp.next;
        }

        temp.next = newnode;
        return head;
    }

    void traverse(Node head);
    Node temp = head;

    System.out.println("Elements ");
    while(temp != null){
        System.out.println(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}

public class MultiplyPolynomial{
    public static void main(String[] args){
        Node head = null;
        Node head2 = null;

        head = insert(head,3,4);
        head = insert(head,2,1);
        head = insert(head,-1,0);

        head2 = insert(head2,15,7);
        head2 = insert(head2,7,3);
        head2 = insert(head2,6,1);

    }
}