package demo;

class MyStack
{
	int top=-1;
	int MAX=20;
	int data[]=new int[MAX];
	
	public void push(int d)
	{
		data[top+1]=d;
		top=top+1;
	}
	public void print()
	{
		for(int i=0;i<=top;i++)
			System.out.println(data[i]);
	}
	public int pop()
	{
		int temp=data[top];
		top=top-1;
		return temp;
	}
	public int peek()
	{
		return data[top+1];
	}
	public boolean isEmpty()
	{
		return (top==-1);
	}
	public int size()
	{
		return top+1;
	}
}
public class Stack 
{

	public static void main(String[] args) 
	{
		MyStack obj= new MyStack();
		obj.push(25);
		obj.push(65);
		obj.push(58);
		
		//obj.print();
		System.out.println(obj.peek());
		//obj.pop();
		System.out.println(obj.pop());
		//obj.print();
		
		//System.out.println(obj.peek());
		
		obj.size();
		

	}

}
