import java.util.*;
public class linkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head=null;
    int i;
    public void creation(){
       do{
        System.out.print("Enter data of node: ");
        int data=new Scanner(System.in).nextInt();
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
        }

        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
        }

        System.out.println();
        System.out.println("Enter any integer without '0' for insrting more nodes: ");
        i=new Scanner(System.in).nextInt();
       }
       while(i!=0);
    }


    //traversing
    public void Traversing(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+",");
            temp=temp.next;
        }
    }
}
