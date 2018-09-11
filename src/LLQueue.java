
import javax.swing.JOptionPane;

public class LLQueue implements Queue {
	protected SLinkedList sll;
	
	
	public LLQueue() {
		sll = new SLinkedList();
		
	}
	public void enqueue(Object n) {
		if (isEmpty()) {  //if it is empty enqueue at head of ll
			//JOptionPane.showMessageDialog(null, "Enqueued");
			sll.insertHead(n);
		}
		else {
		sll.gotoTail();
		sll.insertNext(n);
		//JOptionPane.showMessageDialog(null, "Enqueued");
		}
		
	}
	
	public Object dequeue() {
		if(isEmpty()) {
			//JOptionPane.showMessageDialog(null, "Nothing to dequeue");
			return null;}
		
		  sll.gotoHead();
		 Object toReturn = sll.getCurr();
		 
		 sll.deleteHead();
		 //JOptionPane.showMessageDialog(null, "Word dequeued: " + toReturn);
		 
		
		return toReturn;
	}
	
	public boolean isFull() {
		
		return false;
	}
	
	public boolean isEmpty() {
		
		return(sll.size == 0);
	}
	
	public Object front() {
		
		return sll.head;
	}

}

