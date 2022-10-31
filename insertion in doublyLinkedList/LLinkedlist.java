import java.util.*;
public class LLinkedlist {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    Node head=null;
    Node tail=null;
    int data,n,m,p;
    public void creation(){
        do{
        System.out.println("Enter Data");
        data=new Scanner(System.in).nextInt();
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            tail=new_node;
        }

        else{
            System.out.println("Enter 1 for inserting at start, 2 for end ANd 3 for end");
            m=new Scanner(System.in).nextInt();
            switch(m){
                case 1:
                    head.prev=new_node;
                    new_node.next=head;
                    head=new_node;
                    break;

                case 2:
                    tail.next=new_node;
                    new_node.prev=tail;
                    tail=new_node;
                    break;
                    
                case 3:
                    System.out.println("Enter the position u wannna insert node");
                    p=new Scanner(System.in).nextInt();
                    Node temp1=head;
                    Node ptr=temp1.next;
                    for(int i=1;i<p-1;i++){
                        temp1=ptr;
                        ptr=ptr.next;
                    }
                    new_node.prev=temp1;
                    new_node.next=ptr;
                    temp1.next=new_node;
                    ptr.prev=new_node;
                    break;

            }
        }

        System.out.println("Enter 0 for inserting More Nodes");
        n=new Scanner(System.in).nextInt();


        }
        while(n==0);
    }


    //Traversion
    public void Traverse(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+",");
            temp=temp.next;
        }
    }
}
