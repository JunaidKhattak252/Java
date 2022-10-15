import java.util.*;
class Linkedlist {
    public static class Node {
        int data;
        Node Next;

        Node(int data) {
            this.data = data;
            this.Next = null;

        }
    }

    Node head=null;
    public void CreateNode(){
       int i=0;
       while(i<1){
        System.out.println("Enter the data of node");
        int data=new Scanner(System.in).nextInt();
        Node new_node=new Node(data);

        if(head==null){
            head=new_node;
        }

        else{
            new_node.Next=head;
            head=new_node;
        }
        System.out.println("Enter 0 for inserting more nodes and any other number for break");
        int num=new Scanner(System.in).nextInt();
        if(num!=0){
            break;
        }
       }
    }


    public void Traverse(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+",");
            temp=temp.Next;
        }
    }

    public static void main(String[] args) {
        Linkedlist l=new Linkedlist();
        l.CreateNode();
        l.Traverse();
    }

}