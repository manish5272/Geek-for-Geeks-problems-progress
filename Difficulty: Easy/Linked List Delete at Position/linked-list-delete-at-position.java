
class Solution {
    Node deleteNode(Node head, int x) {
        
        if(head == null){
            return null;
        }
        
        if(x==1){
            return head.next;
        }
        
        
        Node temp=head;
        for(int i=1;i<x-1;i++){
            if(temp.next==null){
                return head;
            }
            temp=temp.next;
        }
        
        if(temp.next!=null && temp!=null){
            temp.next=temp.next.next;
        }
        
        
        return head;
    }
}