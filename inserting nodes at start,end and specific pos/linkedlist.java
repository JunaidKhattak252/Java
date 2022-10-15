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

    public void creation(){
        int i=0;
        while(i<1){
            System.out.println("Enter data of Node:");
            int data=new Scanner(System.in).nextInt();
            Node new_node=new Node(data);
      
            if(head==null){
              head=new_node;
            }
      
            else{
              System.out.println("Enter 'B' for beginning & 'E' for end and 'S' for specific position: ");
              char ch=new Scanner(System.in).next().charAt(0);
              switch(ch){
                  case 'b':
                  new_node.next=head;
                  head=new_node;
                  break;
      
                  case 'e':
                  Node temp=head;
                  while(temp.next!=null){
                      temp=temp.next;
                  }
                  temp.next=new_node;
                  break;
      
                  case 's':
                  System.out.println("Enter the position u wanna insert Node:");
                  int pos=new Scanner(System.in).nextInt();
                  Node temp1=head;
                  for(int j=1;j<pos-1;j++){
                      temp1=temp1.next;
                  }
                  new_node.next=temp1.next;
                  temp1.next=new_node;
                  break;
      
                  default:
                  System.out.println("Invalid Input");
      
              }
            }

            System.out.println("Enter 1 for Adding more Nodes & Any other integer for break:");
            int num=new Scanner(System.in).nextInt();
            if(num!=1){
                break;
            }
        }
    }



    //Traversion
    public void Traversion(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+",");
            temp=temp.next;
        }
    }
}
