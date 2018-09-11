import javax.swing.JOptionPane;

public class TimeTest {
	private int num;
	private static long llqTime;
	private static long arrqTime;
	
	

	
	public void llQueueTest() {
		
		Queue q = new LLQueue();
		
		long time1 = System.nanoTime();
		for(int x = 0; x<num; x++) {
		q.enqueue("The String" + x);
		
		}
		while(! q.isEmpty()) {
			 q.dequeue(); 
			
		}
		long time2 = System.nanoTime();
		
		 llqTime = (time2 - time1);
	}
	
	public void arrayQueueTest() {
		Queue r = new ArrayQueue(num);
		
		long time3 = System.nanoTime();
		for(int x = 0; x<num; x++) {
		r.enqueue("The String" + x);
		
		}
		while(! r.isEmpty()) {
			 r.dequeue(); 
			
		}
		long time4 = System.nanoTime();
		
		 arrqTime = (time4 - time3);
	}
	
	public void numInput() {
		
		num = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter n:"));
	}
	
	public static void main(String[] args) {
		
		TimeTest test=new TimeTest();
		
		test.numInput(); //inputs number
		
		
		test.llQueueTest(); //gets the time for llQueue using num inputted
		test.arrayQueueTest();	//gets the time for arrayQueue using num inputted	
		
		
	    System.out.println("Time for arrayQueue: " + arrqTime);
		javax.swing.JOptionPane.showMessageDialog(null, "Time for LinkedListQueue: " + llqTime);
	}
	
	
}
