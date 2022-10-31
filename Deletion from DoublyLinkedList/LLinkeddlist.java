public class LLinkeddlist {
    public void deletion(){
        int m,p,n;
        do{
            if(head==null){
                System.out.println("LinkedList doesnot Exist");
            }
    
            else{
                System.out.println("Enter 1 to delete From Beginning, 2 for End and 3 for a specific Location");
                m=new Scanner(System.in).nextInt();
                switch(m){
                    case 1:
                        Node temp=head;
                        temp=temp.next;
                        head=temp;
                        head.prev=null;
                        break;
    
                    case 2:
                        Node temp1=tail;
                        temp1=temp1.prev;
                        temp1.next=null;
                        tail=temp1;
                        break;
    
                    case 3:
                        System.out.println("Enter the position u wanna delete");
                        p=new Scanner(System.in).nextInt();
                        Node temp2=head;
                        Node ptr1=temp2.next;
    
                        for(int i=1;i<p-1;i++){
                            temp2=ptr1;
                            ptr1=ptr1.next;
                        }
                        temp2.next=ptr1.next;
                        ptr1.next.prev=temp2;
                        break;
    
    
    
                }
            }
    
            System.out.println("Enter 0 for deleting more Nodes");
            n=new Scanner(System.in).nextInt();
    
        }
        while(n==0);
       }
}
