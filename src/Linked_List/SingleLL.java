/*package Linked_List;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SingleLL {
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        Node head=n1;

        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.print("null");

    }
}

*/
/*
package Linked_List;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class linkedlist{
    Node head;
      void insert(int data) {
        Node newnode=new Node(data);

        if (head==null){
            head=newnode;
            return ;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    void insertatstart(int data){
    Node newnode2=new Node(data);
    if(head==null){
        head=newnode2;
        return ;
    }
    newnode2.next=head;
    head=newnode2;
    return ;

    }
    void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }


}
public class SingleLL {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    linkedlist n1=new linkedlist();
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        n1.insert(sc.nextInt());
    }
    n1.insertatstart(100);
        n1.display();

        deletenode();
        n1.display();
    }
}
static void deletenode(int data){

}*/

package Linked_List;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedlist {
    Node head;

    void insert(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void insertatstart(int data) {
        Node newnode2 = new Node(data);

        if (head == null) {
            head = newnode2;
            return;
        }

        newnode2.next = head;
        head = newnode2;
    }

    void deletenode(int data) {

        if (head == null) return;

        // If head needs to be deleted
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;

        // Find node before the one to delete
        while (temp.next != null) {
            if (temp.next.data == data) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }


    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class SingleLL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        linkedlist n1 = new linkedlist();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            n1.insert(sc.nextInt());
        }

        n1.insertatstart(100);

        n1.display();

        int deleteValue = sc.nextInt(); // value to delete
        n1.deletenode(deleteValue);

        n1.display();

    }
}
