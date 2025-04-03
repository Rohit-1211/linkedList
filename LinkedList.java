public class LinkedList {
  class Node {
    int data;
    Node next;
    Node (int data){
    this.data = data; 
    this.next = null;
  }
}
Node head;
public void addFirst(int data){
  Node newnode = new Node(data);
  newnode.next = head;
  head = newnode;
}
public void addLast(int data){
  Node newnode = new Node(data);
  if(head == null){
  head = newnode;
  return;
  }
  Node temp = head;
  while (temp.next != null){
    temp = temp.next;
  }
  temp.next = newnode;
}
public void deleteAt(int idx){
  Node temp = head;
  for (int i=1;i<=idx-1;i++){
    temp = temp.next;
  }
  temp.next = temp.next.next;

}
public void printList(){
  Node temp = head;
  System.out.println("Head->");
  while(temp.next!=null){
    System.out.println(temp.data + "->");
    temp = temp.next;
  }
  System.out.println(temp.data + "->" );
}                                                                    

public static void main (String args[]){
  LinkedList ll = new LinkedList();
  ll.addFirst(4);
  ll.addFirst(6);
  ll. printList();
  ll.addLast(8);
  ll.addLast(9);
  ll. printList();
  ll.deleteAt(5);
  ll.printList();
  
}
}

