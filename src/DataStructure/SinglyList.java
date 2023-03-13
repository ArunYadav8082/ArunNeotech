package DataStructure;

public class SinglyList {

	private ListNode  head;
	
	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data = data;
			this.next = next;
		}
		}
	public void display()
	{
		ListNode current = head;
		while(current!=null)
		{
			System.out.print(current.data + "-->");
			current =  current.next;
		}
		System.out.print("null");
		
	}
	public int length()
	{
		if(head==null)
		{
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while(current!=null)
		{
			count++;
			current = current.next;
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		
		SinglyList ts = new SinglyList ();
		
		ts.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(40);
		ListNode fourth= new ListNode(50);
		ListNode fifth = new ListNode(30);
		
		ts.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		ts.display();
		System.out.println();
		System.out.println("***************************");
		System.out.println(ts.length());
	}
		
	
}
