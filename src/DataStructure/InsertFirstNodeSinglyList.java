package DataStructure;

public class InsertFirstNodeSinglyList {
	
	private ListNode head;
	
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
			ListNode current =  head;
			while(current!=null)
			{
				System.out.print(current.data+"--->");
				current = current.next;
			
		}
			System.out.print("null");
	}
		public void insert(int value)
		{
			ListNode list = new ListNode(value);
			list.next = head;
			head = list;
		}
		public static void main(String[] args) {
			
			InsertFirstNodeSinglyList is = new InsertFirstNodeSinglyList();
			
			is.insert(8);
			is.insert(18);
			is.insert(28);
			is.insert(38);
			
			is.display();
		}

}
