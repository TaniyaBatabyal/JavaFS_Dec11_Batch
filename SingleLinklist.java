package demo;


	class Node
	{
		public int data;
		public Node next;
		
		public void printData()
		{
			System.out.println(data+">>");
		}
	}
	
	class SingleLink
	{
		public Node head;
		
		public boolean isEmpty()
		{
			return(head==null);
		}
		
		public void insertFirst(int d)
		{
			Node n = new Node();
			n.next=head;
			n.data= d;
			head=n;
		}
		public void insertLast(int d)
		{
			Node n=new Node();
			n.next=null;
			n.data= d;
			
			if(head==null)
				head=n;
				
			else
				{
				 Node current= head;
				 while(current.next!= null)
				 {
					 current= current.next;
				 }
				 current.next=n;
				}
		}
		public void deleteFirst()
		{
			head=head.next;
		}
		public void printElement()
		{
			Node current = head;
			while(current!=null)
			{
				current.printData();;
				current= current.next;
				
			}
		}
	}
	public class SingleLinklist 
	{
	public static void main(String[] args) 
	{
		SingleLink obj = new SingleLink();
		obj.insertFirst(50);
		obj.insertFirst(60);
		obj.insertFirst(80);
		
		obj.printElement();
		
		obj.deleteFirst();
		System.out.println("After delete first element");
		obj.printElement();
		System.out.println("After insert last element");
		obj.insertLast(90);
		obj.printElement();
		
		

	}

}
